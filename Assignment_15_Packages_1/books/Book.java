package Assignment_15_Packages_1.books;

public class Book {
    String title;
    String author;
    String isbn;

    public Book(String title,String author,String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
