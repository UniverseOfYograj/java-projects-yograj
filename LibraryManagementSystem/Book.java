package LibraryManagementSystem;

import java.util.Objects;

public class Book {
    private String bookName;
    private String author;
    private double price;

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
