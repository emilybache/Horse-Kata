using System;

namespace horse
{

    public static class SampleHorseData
    {
        /// <summary>
        /// Sample Horse table headers which you could adapt for your tests.
        /// </summary>
        public static List<string> GetSampleHeaders()
        {
            return new List<String>{ "Breed", "Colour", "Height", "Age", "Shoes" };
        }

        /// <summary>
        /// Sample Horse data which you could adapt for your tests. Horses
        /// may have more or less parameters than this and there may be more or less rows
        /// in the table.
        /// </summary>
        public static List<List<object>> GetSampleTableData()
        {
            return new List<List<Object>>
            {
                {"Thoroughbred", "Bay", 1.60, 3, true},
                {"Thoroughbred", "Grey", 1.55, 3, true},
                {"Arabian horse", "Bay", 0.95, 5, true},
                {"Shetland Pony", "Black", 1.01, 2, false},
                {"Shire horse", "Black", 1.51, 4, true},
            };
        }

        /// <summary>
        /// Sample filter metadata that filters on two fields
        /// Breed must equal 'Thoroughbred' and age must equal 3
        /// </summary>
        public static List<FilterMetadata> GetSampleFilters()
        {
            return new List<FilterMetadata>
            {
                FilterMetadata("Breed", "Thoroughbred"),
                FilterMetadata("Age", 3),
            };
        }

        /// <summary>
        /// Sample sort metadata. You only ever sort on one field.
        /// In this example you should sort by horse height descending
        /// </summary>
        public static SortMetadata GetSampleSortMetadata()
        {
            return new SortMetadata("Height", order = "DESCENDING");
        }

        /// <summary>
        /// Sample pagination metadata. In this example, each page of data should have 3 rows and
        /// the first record that should be shown on the page is the one at index 4.
        /// </summary>
        public static PaginationMetadata GetSamplePaginationMetadata()
        {
            return new PaginationMetadata(firstRecordInPage = 4, pageSize = 3);
        }
    }

}
