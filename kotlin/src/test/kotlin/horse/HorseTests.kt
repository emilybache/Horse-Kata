package horse

import org.junit.Test
import com.google.gson.Gson
import org.approvaltests.Approvals


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
    val gson = Gson()
    val json = gson.toJson(table)
    // Assert the data to be sent to the front end
    Approvals.verifyJson(json)
  }
}
