package net.cheltsov.entity;

import java.util.Objects;

public class Book extends Edition {
    private String author;
    private int pageCount;
    private String publisher;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pageCount, publisher);
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", publisher='" + publisher + '\'' +
                "} " + super.toString();
    }
}
