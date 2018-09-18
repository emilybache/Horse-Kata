using System;
using System.Collections.Generic;

namespace horse
{
    public static class Horse
    {

        /// <summary>
        /// This method is called by the front end when it wants to display a page of horse data.
        /// </summary>
        public static PaginatedTable FilterSortPaginateTable(List<string> headers, List<List<object>> tableData,
            List<FilterMetadata> filters, SortMetadata sortMetadata, PaginationMetadata paginationMetadata)
        {
            // todo: filter horse table using filters

            // todo: sort horse table using sortMetadata

            // todo: paginate horse table using paginationMetadata

            throw new NotImplementedException();
        }
    }

    /// <summary>
    /// The front end provides this data about the requested pagination
    /// </summary>
    public class PaginationMetadata 
    {
        private int pageSize;
        private int currentPage;

        public PaginationMetadata(int pageSize, int currentPage)
        {
            this.pageSize = pageSize;
            this.currentPage = currentPage;
        }
    }

    /// <summary>
    /// the front end provides this data about the requested sort order
    /// </summary>
    public class SortMetadata
    {
        private string columnHeader;
        private string order;

        public SortMetadata(string columnHeader, string order)
        {
            this.columnHeader = columnHeader;
            this.order = order;
        }
    }

    /// <summary>
    /// The front end provides a list of these specifying the requested filters
    /// </summary>
    public class FilterMetadata
    {
        private string columnHeader;
        private object value;
        private string matchMode;

        public FilterMetadata(string columnHeader, object value, string matchMode)
        {
            this.columnHeader = columnHeader;
            this.value = value;
            this.matchMode = matchMode;
        }
    }


    /// <summary>
    /// instances of this class can be returned to the front end for display
    /// </summary>
    public class PaginatedTable
    {
        // the headers for the table
        private List<string> headers;

        // The data to show in the current page of the table
        private List<List<string>> tableData;

        // the total number of rows, including those rows not shown on the current page
        private int totalRows;

        public PaginatedTable(List<string> headers, List<List<string>> tableData, int totalRows)
        {
            this.headers = headers;
            this.tableData = tableData;
            this.totalRows = totalRows;
        }
    }
}
