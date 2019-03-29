package codingdojo;


import java.util.Arrays;
import java.util.List;

class SampleHorseData {
    /**
     * Sample Horse table headers which you could adapt for your tests.
     */
    static List<String> GetSampleHeaders() {
        return Arrays.asList("Breed", "Colour", "Height", "Age", "Shoes");
    }

    /**
     * Sample Horse data which you could adapt for your tests. Horses
     * may have more or less parameters than this and there may be more or less rows
     * in the table.
     */
    static List<List<Object>> GetSampleTableData() {
        return Arrays.asList(
                Arrays.asList("Thoroughbred", "Bay", 1.60, 3, true),
                Arrays.asList("Thoroughbred", "Grey", 1.55, 3, true),
                Arrays.asList("Arabian horse", "Bay", 1.51, 5, true),
                Arrays.asList("Shetland Pony", "Black", 1.01, 2, false),
                Arrays.asList("Shire horse", "Black", 1.71, 4, true)
        );
    }

    /**
     * Sample filter metadata that filters on two fields
     * Breed must equal 'Thoroughbred' and age must equal 3
     */
    static List<FilterMetadata> GetSampleFilters() {
        return Arrays.asList(
                new FilterMetadata("Breed", "Thoroughbred"),
                new FilterMetadata("Age", 2)
        );
    }

    /**
     * Sample sort metadata. You only ever sort on one field.
     * In this example you should sort by horse height descending
     */
    static SortMetadata GetSampleSortMetadata() {
        return new SortMetadata("Height", "Descending");
    }

    /**
     * Sample pagination metadata. In this example, each page of data should have 3 rows and
     * the first record that should be shown on the page is the one at index 4.
     */
    static PaginationMetadata GetSamplePaginationMetadata() {
        return new PaginationMetadata(4, 3);
    }
}


