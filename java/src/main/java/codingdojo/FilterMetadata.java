package codingdojo;

/**
 * The front end provides a list of these specifying the requested filters
 */
class FilterMetadata {
    final String columnHeader;
    final Object value;

    public FilterMetadata(String columnHeader, Object value) {
        this.columnHeader = columnHeader;
        this.value = value;
    }
}