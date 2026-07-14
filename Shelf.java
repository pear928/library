import java.util.*;

public class Shelf {
    private ArrayList<Book> bookList; 

    public Shelf () {
        bookList = new ArrayList<Book>();
    }
    
    public int Size () {
        return bookList.size();    
    }
    
    public Book getBook(int index) {
        return bookList.get(index);
    }
    
    public void addBook(Book addition) {
        bookList.add(addition);
    }
    
    public void removeBook(Book subtraction) {
        bookList.remove(subtraction);
    }
    
    public void displayBookshelf() {
    int booksPerShelf = 20;

    for (int shelf = 0; shelf < 5; shelf++) {

        System.out.println(
            "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
        );

        for (int book = 0; book < booksPerShelf; book++) {

            int index = shelf * booksPerShelf + book;

            if (index < bookList.size()) {

                String title = bookList.get(index).getTitle();
                System.out.printf("| %-12s ", title);
            }
        }
        System.out.println("|");
    }

    System.out.println(
        "--------------------------------------------------------------------------------------------------------------------------------"
    );
}
}