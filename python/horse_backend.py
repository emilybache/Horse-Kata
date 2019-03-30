
from filter import FilterMetadataDto
from sort import SortMetadataDto
from paginate import PaginatedTableDto, PaginationMetadataDto


def filter_sort_paginate_table(table_headers: list,
                               table_data: list,
                               filter_metadata: FilterMetadataDto,
                               sort_metadata: SortMetadataDto,
                               pagination_metadata: PaginationMetadataDto) -> PaginatedTableDto:
    """This method is called by the front end when it wants to display a page of horse data. """
    # todo: filter horse table using filter_metadata

    # todo: sort horse table using sort_metadata

    # todo: paginate horse table using pagination_metadata

    return PaginatedTableDto(totalRows = len(table_data),
                             headers = table_headers[:],
                             rowData = [
                                 [str(elem) for elem in row]
                                        for row in table_data
                             ]
                             )