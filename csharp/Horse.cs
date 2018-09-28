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
            // TODO: filter horse table using filters

            // TODO: sort horse table using sortMetadata

            // TODO: paginate horse table using paginationMetadata

            throw new NotImplementedException();
        }
    }

    /// <summary>
    /// The front end provides this data about the requested pagination
    /// </summary>
    public class PaginationMetadata 
    {
        // the index of the first record to be shown in the current page of data
        private int FirstRecordInPage { get; set; }

        // the number of rows to show in this page
        private int PageSize { get; set; }

        public PaginationMetadata(int firstRecordInPage, int pageSize)
        {
            this.FirstRecordInPage = firstRecordInPage;
            this.PageSize = pageSize;
        }
    }

    /// <summary>
    /// the front end provides this data about the requested sort order
    /// </summary>
    public class SortMetadata
    {
        private string ColumnHeader { get; set; }
        private string SortOrder { get; set; }

        public SortMetadata(string columnHeader, string sortOrder)
        {
            this.ColumnHeader = columnHeader;
            this.SortOrder = sortOrder;
        }
    }

    /// <summary>
    /// The front end provides a list of these specifying the requested filters
    /// </summary>
    public class FilterMetadata
    {
        private string ColumnHeader { get; set; }
        private object Value { get; set; }
        
        public FilterMetadata(string columnHeader, object value)
        {
            this.ColumnHeader = columnHeader;
            this.Value = value;
       }
    }


    /// <summary>
    /// instances of this class can be returned to the front end for display
    /// </summary>
    public class PaginatedTable
    {
        // the headers for the table
        private List<string> Headers { get; set; }

        // The data to show in the current page of the table
        private List<List<string>> TableData { get; set; }

        // the total number of rows, including those rows not shown on the current page
        private int TotalRows { get; set; }

        public PaginatedTable(List<string> headers, List<List<string>> tableData, int totalRows)
        {
            this.Headers = headers;
            this.TableData = tableData;
            this.TotalRows = totalRows;
        }
    }
}
