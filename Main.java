import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    
        Shelf topShelf = new Shelf();
        
        File names = new File("names.txt");
        Scanner in = new Scanner(names);
        


        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner attribute = new Scanner(line);
            attribute.useDelimiter(", ");
        
            String title = attribute.next();
            int year = Integer.parseInt(attribute.next());
            String genre = attribute.next();
            String author = attribute.next();
        
            title = title.substring(1, title.length() - 1);
            genre = genre.substring(1, genre.length() - 1);
            author = author.substring(1, author.length() - 1);
            
            Book addition = new Book(title, year, genre, author);
            topShelf.addBook(addition);
            
            System.out.println(addition);

        }
        
        System.out.println("\nBookshelf View:\n");
        topShelf.displayBookshelf();
    }
}