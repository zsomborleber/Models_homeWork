package Models;


public class Book {
    public static void main(String[] args) {

    }

        private Author author;
        private String title;
        private int published;
        private String genre;

        public  Book(){}

        public Book(Author author, String title, int published, String genre){
            this.author = author;
            this.title = title;
            this.published = published;
            this.genre = genre;
        }
    public void printBookData(){
        System.out.println("Author: "+ author +
                "\nTitle: " + title +
                "\nPublished: " + published +
                "\nGenre: " + genre);

        }


    public void setAuthor(Author Author) {
        this.author = author;

    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                '}';
    }

    public Author getAuthor() {
        return author;
    }
    public void setTitle(String title){
            this.title = title;
    }
    public String getTitle(){
            return title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}

