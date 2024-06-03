// Write a program that first reads book information from the user.
// The details to be asked for each book include the title, the number 
// of pages and the publication year. Entering an empty string as 
// the name of the book ends the reading process.

public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int publicationYear() {
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
    
}
