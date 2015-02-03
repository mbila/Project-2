/**
 * Write a description of class GetInfo here.
 * 
 * @author Mike Bila
 * @version 2015.01.28
 */
public class library
{
    // instance variables - replace the example below with your own
    private Book Book;
    private String lastName, firstName, ISBN, title, publicationDate, numPages;

    /**
     * Constructor for objects of class library
     */
    public library()
    {
        
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    public void setNumPages(String numPages) {
        this.numPages = numPages;
    }
    
    public void makeBook() {
        Book = new Book(lastName, firstName, ISBN, title, publicationDate, numPages);
    }
    
    public String getLastName() {
        return Book.getLastName();
    }
    
    public String getFirstName() {
        return Book.getFirstName();
    }
    
    public String getISBN() {
        return Book.getISBN();
    }
    
    public String getTitle() {
        return Book.getTitle();
    }
    
    public String getPublicationDate() {
        return Book.getPublicationDate();
    }
    
    public String getNumPages() {
        return Book.getNumPages();
    }
}