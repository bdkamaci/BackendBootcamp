package java102.BookSorter;

public class Book implements Comparable<Book> {
    private String name;
    private int pageNum;
    private String authorName;
    private int publishDate;

    // Constructor
    public Book(String name, int pageNum, String authorName, int publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    // Implementing compareTo method for sorting by title
    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Title: " + name + ", Page Count: " + pageNum + ", Author: " + authorName + ", Publication Year: " + publishDate;
    }

    // Get and Set Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

}
