
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
        return "Автор: " + this.name + " " + this.author;
    }


public boolean equals(Object Book) {
    if (Book == null) {
        return false;
    }
    if (this == Book) {
        return true;
    }
    if (this.getClass() != Book.getClass()) {
        return false;
    }
    Author author = (Author) Book;
    return name.equals((author.getName()) && name.equals(author.Author));
}


    public int hashCode() {
        return java.util.Objects.hash(name, author);

    }


}