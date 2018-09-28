from horse_backend import filter_sort_paginate_table
from sample_horse_data import sample_headers, sample_horse_data, sample_filter_metadata, sample_sort_metadata, sample_pagination_metadata


def test_filter_sort_paginate():
    headers = sample_headers()
    horse_data = sample_horse_data()
    filter_metadata = sample_filter_metadata()
    sort_metadata = sample_sort_metadata()
    pagination_metadata = sample_pagination_metadata()

    result = filter_sort_paginate_table(headers, horse_data, filter_metadata,
                                        sort_metadata, pagination_metadata)

    assert result is not None
