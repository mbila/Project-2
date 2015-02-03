
/**
 * Write a description of class BookObject here.
 * 
 * @author Mike Bila 
 * @version 2015.01.28
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String lastName;
    private String firstName;
    private String ISBN;
    private String title;
    private String publicationDate;
    private String numPages;

    /**
     * Constructor for objects of class BookObject
     */
    public Book(String lastName, String firstName, String ISBN, String title, String publicationDate, String numPages)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = publicationDate;
        this.numPages = numPages;
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
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getPublicationDate() {
        return publicationDate;
    }
    
    public String getNumPages() {
        return numPages;
    }
}