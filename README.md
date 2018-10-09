Horse Kata
===========

This is an exercise helping you to learn Test-Driven Development. Your task is to test-drive a function that filters, sorts and paginates a bunch of data.
In this case the data concerns horses.

One of the challenges of this exercise is to design suitable test data. There is some sample data provided which you can use as a starting point. Feel free to modify it as needed.

There is also a sample test case provided which is not finished. Feel free to re-design it as you wish.

There is a function in the horse backend marked with 'TODO' statements.
This function should filter, sort and paginate an arbitrary table of horse data, as specified. 
You can change anything about the code, except for the signature of this function. It will be called by a front-end component which expects exactly this signature.

Note on data size and performance: 
- Assume the table data will have no more than 50 000 rows and 100 columns, and will easily fit into available memory space.
- Assume you will filter on a maximum of 100 columns
- Assume you will only sort on one column
- Assume the pagination is for page sizes of anything from 1 to 500 rows.

Use Test-Driven Development!

Language Independent Instructions
---------------------------------

If your favourite programming language isn't present in this repository, please feel free to make a translation and send me a pull request. Alternatively, use this json as a starting point.

A request from the front end might look like this:

    {
        "Filters": [{"ColumnHeader": "Breed", "Value": "Thoroughbred"}, 
                    {"ColumnHeader": "Age", "Value": 2}],
        "Sorting": {"ColumnHeader": "Height", "SortOrder": "Descending"},
        "Pagination": {"FirstRecordInPage": 4, "PageSize": 3}
    }

The table data might look like this, although you should write code that would work with more columns and more rows:

    {
        "Headers": ["Breed", "Colour", "Height", "Age", "Shoes"],
        "TableData": [["Thoroughbred", "Bay", 1.60, 3, true],
                      ["Thoroughbred", "Grey", 1.55, 3, true],
                      ["Arabian horse", "Bay", 1.51, 5, true],
                      ["Shetland Pony", "Black", 1.01, 2, false],
                      ["Shire horse", "Black", 1.71, 4, true]]
    }

