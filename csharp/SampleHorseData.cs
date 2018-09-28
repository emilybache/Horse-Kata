using System;
using System.Collections.Generic;

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
            return new List<List<object>>
            {
                new List<object>{"Thoroughbred", "Bay", 1.60, 3, true},
                new List<object>{"Thoroughbred", "Grey", 1.55, 3, true},
                new List<object>{"Arabian horse", "Bay", 1.51, 5, true},
                new List<object>{"Shetland Pony", "Black", 1.01, 2, false},
                new List<object>{"Shire horse", "Black", 1.71, 4, true},
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
                new FilterMetadata("Breed", "Thoroughbred"),
                new FilterMetadata("Age", 3),
            };
        }

        /// <summary>
        /// Sample sort metadata. You only ever sort on one field.
        /// In this example you should sort by horse height descending
        /// </summary>
        public static SortMetadata GetSampleSortMetadata()
        {
            return new SortMetadata("Height", "DESCENDING");
        }

        /// <summary>
        /// Sample pagination metadata. In this example, each page of data should have 3 rows and
        /// the first record that should be shown on the page is the one at index 4.
        /// </summary>
        public static PaginationMetadata GetSamplePaginationMetadata()
        {
            return new PaginationMetadata(4, 3);
        }
    }

}
