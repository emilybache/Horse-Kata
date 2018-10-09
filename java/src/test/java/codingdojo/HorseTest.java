package codingdojo;

import org.junit.jupiter.api.Test;

import java.util.List;

public class HorseTest
    {
        @Test
        public void FilterSortPaginate()
        {
            // Arrange
            List<String> headers = SampleHorseData.GetSampleHeaders();
            List<List<Object>> tableData = SampleHorseData.GetSampleTableData();
            List<FilterMetadata> filters = SampleHorseData.GetSampleFilters();
            SortMetadata sortMetadata = SampleHorseData.GetSampleSortMetadata();
            PaginationMetadata paginationMetadata = SampleHorseData.GetSamplePaginationMetadata();

            // Act
            PaginatedTable table = Horse.FilterSortPaginateTable(headers, tableData, filters, sortMetadata, paginationMetadata);
            
            // TODO: Assert something here
        }
    }

