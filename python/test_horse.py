from horse_backend import filter_sort_paginate_table
from sample_horse_data import sample_headers, sample_horse_data, sample_filter_metadata, sample_sort_metadata, sample_pagination_metadata

import json

expected = \
"""[
    [
        "Thoroughbred",
        "Bay",
        "1.6",
        "3",
        "True"
    ],
    [
        "Thoroughbred",
        "Grey",
        "1.55",
        "3",
        "True"
    ],
    [
        "Arabian horse",
        "Bay",
        "1.51",
        "5",
        "True"
    ],
    [
        "Shetland Pony",
        "Black",
        "1.01",
        "2",
        "False"
    ],
    [
        "Shire horse",
        "Black",
        "1.71",
        "4",
        "True"
    ]
]"""


def test_filter_sort_paginate():
    headers = sample_headers()
    horse_data = sample_horse_data()
    filter_metadata = sample_filter_metadata()
    sort_metadata = sample_sort_metadata()
    pagination_metadata = sample_pagination_metadata()

    result = filter_sort_paginate_table(headers, horse_data, filter_metadata,
                                        sort_metadata, pagination_metadata)

    assert result.totalRows == len(sample_headers())
    assert result.headers == sample_headers()
    assert expected == json.dumps(result.rowData, indent=4)

