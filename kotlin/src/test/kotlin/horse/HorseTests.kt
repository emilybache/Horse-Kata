package horse

import org.junit.Assert.fail
import org.junit.Test

class HorseTests {
  @Test
  fun filterSortPaginate() {
    // arrange
    val headers = SampleHorseData.getSampleHeaders()
    val tableData = SampleHorseData.getSampleTableData()
    val filters = SampleHorseData.getSampleFilters()
    val sortMetadata = SampleHorseData.getSampleSortMetadata()
    val paginationMetadata = SampleHorseData.getSamplePaginationMetadata()

    // act
    val table = Horse.filterSortPaginateTable(headers, tableData, filters, sortMetadata, paginationMetadata)

    // assert
    fail("Assert something here")
  }
}
