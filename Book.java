public class Book {
    private String title  ;
    private String author ;
    private String publisher;
    private int year;
    private int ISBN;
    private boolean available;

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String title, String author, String publisher, int year, int ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.ISBN = ISBN;
        this.available = true;
    }

    public boolean isAvailable(){
        return available;
    }
}
