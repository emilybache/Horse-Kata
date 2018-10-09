package codingdojo;


/**
 * The front end provides this data about the requested pagination
 */
public class PaginationMetadata {
    /**
     * the index of the first record to be shown in the current page of data
     */
    final int firstRecordInPage;

    /**
     * the number of rows to show in this page
     */
    final int pageSize;

    public PaginationMetadata(int firstRecordInPage, int pageSize) {
        this.firstRecordInPage = firstRecordInPage;
        this.pageSize = pageSize;
    }
}
