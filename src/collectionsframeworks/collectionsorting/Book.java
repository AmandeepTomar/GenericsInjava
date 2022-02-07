package collectionsframeworks.collectionsorting;

public class Book {
    private String bookName;
    private String authorName;
    private int pages;

    public Book(String bookName, String authorName, int pages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pages=" + pages +
                '}';
    }
}
