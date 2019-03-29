using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;
using ApprovalTests;
using ApprovalTests.Reporters;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace horse
{
    [UseReporter(typeof(DiffReporter))]
    [TestClass]
    public class HorseTest
    {
        [TestMethod]
        public void FilterSortPaginate_No_Filter_No_Sort_No_Paginate()
        {
            //  this is data from another service or database
            var headers = SampleHorseData.GetSampleHeaders();
            var tableData = SampleHorseData.GetSampleTableData();

            // These objects describe the query we got from the front end
            var filters = new List<FilterMetadata>(){};
            var sortMetadata = new SortMetadata("", "");
            var paginationMetadata = new PaginationMetadata(0, 10);

            // Act
            var table = Horse.FilterSortPaginateTable(headers, tableData, filters, sortMetadata, paginationMetadata);

            // Assert the data to be sent to the front end
            Approvals.VerifyJson(Newtonsoft.Json.JsonConvert.SerializeObject(table));
        }
    }
}
