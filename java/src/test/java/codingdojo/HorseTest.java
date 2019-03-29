package codingdojo;


import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class HorseTest
    {
        @Test
        public void FilterSortPaginate_No_Filters_No_Sorting_No_Pagination()
        {
            // Arrange - this is data from another service or database
            List<String> headers = SampleHorseData.GetSampleHeaders();
            List<List<Object>> tableData = SampleHorseData.GetSampleTableData();

            // These objects describe the query we got from the front end
            List<FilterMetadata> filters = Collections.emptyList();
            Optional<SortMetadata> sortMetadata = Optional.empty();
            PaginationMetadata paginationMetadata = new PaginationMetadata(0, 10);

            // Act
            PaginatedTable table = Horse.FilterSortPaginateTable(headers, tableData, filters, sortMetadata, paginationMetadata);

            // Assert the data to be sent to the front end
            assertEquals(Arrays.asList("Breed", "Colour", "Height", "Age", "Shoes"), table.headers);
            assertEquals(5, table.totalRows);
            Approvals.verifyAll("tableData", table.tableData);
        }
    }

