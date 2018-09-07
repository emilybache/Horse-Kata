from horse_data import HorseFixedParameterDto, HorseTableRowDataDto
from filter import FilterMetadataDto
from sort import SortMetadataDto
from paginate import PaginationMetadataDto


def sample_horse_data():
    """Sample Horse data which you could adapt for your tests. Horses
    may have more or less parameters than this and there may be more or less rows
    in the table."""
    row1_fields = [
        HorseFixedParameterDto(property="Breed", value="Thoroughbred"),
        HorseFixedParameterDto(property="Colour", value="Bay"),
        HorseFixedParameterDto(property="Height", value=1.55),
        HorseFixedParameterDto(property="Age", value=3),
        HorseFixedParameterDto(property="Shoes", value=True),
    ]

    row2_fields = [
        HorseFixedParameterDto(property="Breed", value="Thoroughbred"),
        HorseFixedParameterDto(property="Colour", value="Grey"),
        HorseFixedParameterDto(property="Height", value=1.55),
        HorseFixedParameterDto(property="Age", value=5),
        HorseFixedParameterDto(property="Shoes", value=True),
    ]
    row3_fields = [
        HorseFixedParameterDto(property="Breed", value="Shetland"),
        HorseFixedParameterDto(property="Colour", value="Bay"),
        HorseFixedParameterDto(property="Height", value=0.95),
        HorseFixedParameterDto(property="Age", value=3),
        HorseFixedParameterDto(property="Shoes", value=True),
    ]
    row4_fields = [
        HorseFixedParameterDto(property="Breed", value="Shetland"),
        HorseFixedParameterDto(property="Colour", value="Black"),
        HorseFixedParameterDto(property="Height", value=0.93),
        HorseFixedParameterDto(property="Age", value=6),
        HorseFixedParameterDto(property="Shoes", value=False),
    ]
    row5_fields = [
        HorseFixedParameterDto(property="Breed", value="Thoroughbred"),
        HorseFixedParameterDto(property="Colour", value="Bay"),
        HorseFixedParameterDto(property="Height", value=1.51),
        HorseFixedParameterDto(property="Age", value=3),
        HorseFixedParameterDto(property="Shoes", value=True),
    ]
    row6_fields = [
        HorseFixedParameterDto(property="Breed", value="Thoroughbred"),
        HorseFixedParameterDto(property="Colour", value="Black"),
        HorseFixedParameterDto(property="Height", value=1.39),
        HorseFixedParameterDto(property="Age", value=6),
        HorseFixedParameterDto(property="Shoes", value=True),
    ]
    row7_fields = [
        HorseFixedParameterDto(property="Breed", value="Thoroughbred"),
        HorseFixedParameterDto(property="Colour", value="Black"),
        HorseFixedParameterDto(property="Height", value=1.60),
        HorseFixedParameterDto(property="Age", value=3),
        HorseFixedParameterDto(property="Shoes", value=True),
    ]
    horse_data = {"1": HorseTableRowDataDto(row1_fields),
                  "2": HorseTableRowDataDto(row2_fields),
                  "3": HorseTableRowDataDto(row3_fields),
                  "4": HorseTableRowDataDto(row4_fields),
                  "5": HorseTableRowDataDto(row5_fields),
                  "6": HorseTableRowDataDto(row6_fields),
                  "7": HorseTableRowDataDto(row7_fields),
                  }

    return horse_data


def sample_filter_metadata():
    """Sample filter metadata that filters on two fields
    Breed must contain 'Thoroughbred' and age must equal 3"""
    return {"Breed": FilterMetadataDto(value="Thoroughbred", matchMode="Contains"),
            "Age": FilterMetadataDto(value=3, matchMode="Equals")}


def sample_sort_metadata():
    """Sample sort metadata. You only ever sort on one field.
    In this example you should sort by horse height descending"""
    return SortMetadataDto(column="Height", order="Descending")


def sample_pagination_metadata():
    """Sample pagination metadata. In this example, each page of data should have 2 rows and
    you would like to look at page 1 of the data. The current page is zero index based, so this
    indicates the second page"""
    return PaginationMetadataDto(page_size=2, current_page=1)
