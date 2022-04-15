package Models;

public class Books {
    public static void main(String[] args) {
        Author aS = new Author("Andrzej Sapkowski","Polish",1948);

        Book book1 = new Book();
        book1.setAuthor(aS);
        book1.setTitle("The Last Wish");
        book1.setPublished(1993);
        book1.setGenre("Fantasy");
        book1.printBookData();

        Book book2 = new Book(aS,"Sword of Destiny",1992,"Fantasy");
        Book book3 = new Book(aS,"Blood of Elves",1994,"Fantasy");
        Book book4 = new Book(aS,"Time of Contempt",1995,"Fantasy");




    }
}
