public class Main {
    public static void main(String[] args) {
        Author Dostoevskiy = new Author("Федор", "Достаевский");

        book crimeAndPunishment = new book("Преступление и наказание", 215, Dostoevskiy);

        Author Anshtein = new Author("Альберт", "Энштэйн");

        book theory = new book("Теория относительности", 1921, Anshtein);

        crimeAndPunishment.setYear(6666);

        theory.setYear(2000);

        System.out.println("Книга: " + crimeAndPunishment.getName() + " опубликована в " + crimeAndPunishment.getYear() + " автора книги: " + crimeAndPunishment.getAuthor().getNameAuthor + " " + crimeAndPunishment.getAuthor().getSurnameAuthor());
    }
}

