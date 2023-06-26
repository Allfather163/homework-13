
public class Book {
    private String name;
    private int year;
    private Author author;


    public Book(String name, int year, Author author) {
        this.name = name;

        this.year = year;

        this.author = author;

    }

    public String getName() {

        return this.name;
    }

    public int getYear() {

        return this.year;
    }

    public void setYear(int publisherYear) {

        this.year = publisherYear;
    }


    public Author getAuthor() {
        return this.author;
    }

    public String toString() {
        return "Книга: " + this.name + " " + this.author + " опубликована в " + year;
    }


    public boolean equals(Object book) {
        if (book == null) {
            return false;
        }
        if (this == book) {
            return true;
        }
        if (this.getClass() != book.getClass()) {
            return false;
        }
        Book book1 = (Book) book;
        return name.equals((author.getName()) && name.equals(author.Author));
    }


    public int hashCode() {
        return java.util.Objects.hash(name, author, year);

    }
}