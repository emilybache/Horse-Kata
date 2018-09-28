using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace horse
{
    [TestClass]
    public class HorseTest
    {
        [TestMethod]
        public void FilterSortPaginate()
        {
            // Arrange
            var headers = SampleHorseData.GetSampleHeaders();
            var tableData = SampleHorseData.GetSampleTableData();
            var filters = SampleHorseData.GetSampleFilters();
            var sortMetadata = SampleHorseData.GetSampleSortMetadata();
            var paginationMetadata = SampleHorseData.GetSamplePaginationMetadata();

            // Act
            var table = Horse.FilterSortPaginateTable(headers, tableData, filters, sortMetadata, paginationMetadata);
            
            // TODO: Assert something here
        }
    }
}
