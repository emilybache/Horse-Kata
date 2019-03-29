package codingdojo;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Horse {

    /**
     * This method is called by the front end when it wants to display a page of horse data.
     */
    public static PaginatedTable FilterSortPaginateTable(
            List<String> headers,
            List<List<Object>> tableData,
            List<FilterMetadata> filters,
            Optional<SortMetadata> maybeSortMetadata,
            PaginationMetadata paginationMetadata) {
        // TODO: filter horse table using filters

        // TODO: sort horse table using sortMetadata

        // TODO: paginate horse table using paginationMetadata

        // Map all the data to Strings for the front end
        List<List<String>> tableDataAsStrings = tableData
            .stream()
            .map(row -> row
                .stream()
                .map(Object::toString)
                .collect(Collectors.toList())
            )
            .collect(Collectors.toList());

        return new PaginatedTable(headers, tableDataAsStrings, tableData.size());
    }
}







