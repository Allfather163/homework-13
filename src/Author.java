public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    public String toString() {

        return "Автор: " + this.nameAuthor + " " + this.surnameAuthor;

    }public boolean equals(Object authors) {
        if (authors == null) {
            return false;
        }
        if (this == authors) {
            return true;
        }
        if (this.getClass() != authors.getClass()) {
            return false;
        }
        Author author = (Author) authors;
        return name.equals((author.getName()) && nameAuthor.equals(author.surnameAuthor));
    }
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor, surnameAuthor);

    }


}

