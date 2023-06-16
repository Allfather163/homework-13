public class book {
    public class Book {
        private String name;
        private int Year;
        private String nameAuthor;
        private String surnameAuthor;

        public Book(String name, int Year, String nameAuthor, String surnameAuthor) {
            private Author author;

    public Book(String name, int Year,  Author){
                this.name = name;
                this.Year = Year;
                this.nameAuthor = nameAuthor;
                this.surnameAuthor = surnameAuthor;
                this.author = author;
            }
            public String getName () {

                return this.name;
            }
            public int Year () {

                return this.Year;
            }
            public void setPublisherYear ( int publisherYear){

                this.Year = Year;
            }
            public String getNameAuthor () {
                return this.nameAuthor;
            }
            public String getSurnameAuthor () {
                return this.surnameAuthor;
                public Author getAuthor () {
                    return this.author;
                }
            }
        }
    }
}

