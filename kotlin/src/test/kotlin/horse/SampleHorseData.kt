package horse

object SampleHorseData {
  /** Sample Horse table headers which you could adapt for your tests. */
  fun getSampleHeaders(): List<String> =
      listOf("Breed", "Colour", "Height", "Age", "Shoes")

  /**
   * Sample Horse data which you could adapt for your tests. Horses
   * may have more or less parameters than this and there may be more or less rows
   * in the table.
   */
  fun getSampleTableData(): List<List<Any>> {
    return listOf(
        listOf("Thoroughbred", "Bay", 1.60, 3, true),
        listOf("Thoroughbred", "Grey", 1.55, 3, true),
        listOf("Arabian horse", "Bay", 1.51, 5, true),
        listOf("Shetland Pony", "Black", 1.01, 2, false),
        listOf("Shire horse", "Black", 1.71, 4, true)
    )
  }

  /**
   * Sample filter metadata that filters on two fields,
   * Breed must equal 'Thoroughbred' and age must equal 3.
   */
  fun getSampleFilters(): List<FilterMetadata> =
      listOf(
          FilterMetadata("Breed", "Thoroughbred"),
          FilterMetadata("Age", 2)
      )

  /**
   * Sample sort metadata. You only ever sort on one field.
   * In this example you should sort by horse height descending.
   */
  fun getSampleSortMetadata(): SortMetadata =
      SortMetadata("Height", "DESCENDING")

  /**
   * Sample pagination metadata. In this example, each page of data should have 3 rows and
   * the first record that should be shown on the page is the one at index 4.
   */
  fun getSamplePaginationMetadata(): PaginationMetadata =
      PaginationMetadata(4, 3)
}
