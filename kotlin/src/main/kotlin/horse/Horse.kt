package horse

class Horse {
  companion object {
    /** This method is called by the front end when it wants to display a page of horse data. */
    fun filterSortPaginateTable(
        headers: List<String>,
        tableData: List<List<Any>>,
        filters: List<FilterMetadata>,
        sortMetadata: SortMetadata,
        paginationMetadata: PaginationMetadata
    ): PaginatedTable {
      // TODO: filter horse table using filters

      // TODO: sort horse table using sortMetadata

      // TODO: paginate horse table using paginationMetadata

      TODO()
    }
  }
}

/** The front end provides this data about the requested pagination. */
data class PaginationMetadata(
    /** The index of the first record to be shown in the current page of data. */
    val firstRecordInPage: Int,
    /** The number of rows to show in this page. */
    val pageSize: Int
)

/** The front end provides this data about the requested sort order. */
data class SortMetadata(
    val columnHeader: String,
    val sortOrder: String
)

/** The front end provides a list of these specifying the requested filters. */
data class FilterMetadata(
    val columnHeader: String,
    val value: Any
)

/** Instances of this class can be returned to the front end for display. */
data class PaginatedTable(
    /** The headers for the table. */
    val headers: List<String>,
    /** The data to show in the current page of the table. */
    val tableData: List<List<String>>,
    /** The total number of rows, including those rows not shown on the current page. */
    val totalRows: Int
)
