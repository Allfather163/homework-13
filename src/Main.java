public class Main {
    public static void main(String[] args) {
        Author Dostoevskiy = new Author("Федор", "Достаевский");

        Book crimeAndPunishment = new Book("Преступление и наказание", 215, Dostoevskiy);

        Author Anshtein = new Author("Альберт", "Энштэйн");

        Book theory = new Book("Теория относительности", 1921, Anshtein);

        crimeAndPunishment.Year(6666);

        theory.Year(2000);
    }
}

