from filter import FilterMetadataDto
from sort import SortMetadataDto
from paginate import PaginationMetadataDto


def sample_horse_data():
    """Sample Horse data which you could adapt for your tests. Horses
    may have more or less parameters than this and there may be more or less rows
    in the table."""
    headers = ["Breed", "Colour", "Height", "Age", "Shoes"]

    horse_data = [["Thoroughbred", "Bay", 1.60, 3, True],
                  ["Thoroughbred", "Grey", 1.55, 3, True],
                  ["Shetland", "Bay", 0.95, 5, True],
                  ["Shetland", "Black", 1.01, 2, False],
                  ["Icelandic", "Black", 1.51, 4, True],
                  ]

    return headers, horse_data


def sample_filter_metadata():
    """Sample filter metadata that filters on two fields
    Breed must equal 'Thoroughbred' and age must equal 3"""
    return [FilterMetadataDto(column_header="Breed", value="Thoroughbred", matchMode="Equals"),
            FilterMetadataDto(column_header="Age", value=3, matchMode="Equals")]


def sample_sort_metadata():
    """Sample sort metadata. You only ever sort on one field.
    In this example you should sort by horse height descending"""
    return SortMetadataDto(column_header="Height", order="DESCENDING")


def sample_pagination_metadata():
    """Sample pagination metadata. In this example, each page of data should have 3 rows and
    you would like to look at page 1 of the data. The current page is zero index based, so this
    indicates the second page"""
    return PaginationMetadataDto(page_size=3, current_page=1)
