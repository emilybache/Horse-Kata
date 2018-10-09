package codingdojo;

/**
 * the front end provides this data about the requested sort order
 */
class SortMetadata {
    final String columnHeader;
    final String sortOrder;

    public SortMetadata(String columnHeader, String sortOrder) {
        this.columnHeader = columnHeader;
        this.sortOrder = sortOrder;
    }
}