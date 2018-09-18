using System;

namespace horse
{

    public static class SampleHorseData
    {
        public static List<string> GetSampleHeaders()
        {
            return new List<String>{ "Breed", "Colour", "Height", "Age", "Shoes" };
        }

        public static List<List<object>> GetSampleTableData()
        {
            return new List<List<Object>>
            {
                {"Thoroughbred", "Bay", 1.60, 3, true},
                {"Thoroughbred", "Grey", 1.55, 3, true},
                {"Shetland", "Bay", 0.95, 5, true},
                {"Shetland", "Black", 1.01, 2, false},
                {"Icelandic", "Black", 1.51, 4, true},
            };
        }

        public static List<FilterMetadata> GetSampleFilters()
        {
            return new List<FilterMetadata>
            {
                FilterMetadata("Breed", "Thoroughbred", matchMode = "Equals"),
                FilterMetadata("Age", 3, matchMode = "Equals"),
            };
        }

        public static SortMetadata GetSampleSortMetadata()
        {
            return new SortMetadata("Height", order = "DESCENDING");
        }

        public static PaginationMetadata GetSamplePaginationMetadata()
        {
            return new PaginationMetadata(pageSize=3, currentPage=1);
        }
    }

}
