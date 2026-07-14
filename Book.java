public class Book {
    
    private String title;
    private int year;
    private String genre;
    private String author;
    
    public Book(String title, int year, String genre, String author) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return "Title: " + title + "\n" + "Year: " + year + "\n" + "Genre: " + genre + "\n" + "Author: " + author + "\n" + "--------------------";
    }
}