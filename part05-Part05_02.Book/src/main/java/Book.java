public class Book {
    // instance variables
    private String author;
    private String name;
    private int pages;

    // Constructor
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    // Method that returns the book's author's name
    public String getAuthor() {
        return author;
    }

    // Method that returns the name of the book
    public String getName() {
        return name;
    }

    
    // Method that reutnrs the number of pages in the book
    public int getPages() {
        return pages;
    }

    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}