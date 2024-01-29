public class Library {
    private Book[]books;
    private LibraryUser[]libraryUsers;
    private int bookcount = 0;
    private int usercount = 0;
    public Library(int booksMax, int userMax){
        books = new Book[booksMax];
        libraryUsers = new LibraryUser [userMax];
    }
    public void addBook(Book book){
        if(bookcount < books.length){
            books[bookcount++] = book;
        }
        else{
            System.out.printf("Лимит превышен!");
        }
    }
    public void addUser(LibraryUser libraryUser){
        if(usercount < libraryUsers.length){
            libraryUsers[usercount++] = libraryUser;
        }
        else{
            System.out.printf("Лимит превышен!");
        }
    }
    public Book foundTitleBook(String title){
        for(int i = 0; i < bookcount; i++){
            if(books[i].getTitle().equals(title))
                return books[i];
        }
        return null;
    }
    public void removeBook(Book book){
        for(int i = 0; i == bookcount; i--){
            if(books[i] == book){
                books[i] = books[bookcount -1];
                books [bookcount -1] = null;
                bookcount--;
                break;
            }
        }
    }

    public boolean leandBook(Book book, LibraryUser user) {
        if(book.isAvailable()){
            book.setAvailable(false);
            return true;
        }
        else{
            return false;
        }
    }
}
