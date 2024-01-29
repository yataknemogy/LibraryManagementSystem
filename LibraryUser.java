public class LibraryUser {
    private String name;
    private String adress;
    private int numberLibrary;
    private Book[] borrowedBooks;
    private int borrowedcount;
    public LibraryUser(String name, String adress, int numberLibrary, int maxBorrowedBooks) {
        this.name = name;
        this.adress = adress;
        this.numberLibrary = numberLibrary;
        this.borrowedBooks = new Book[maxBorrowedBooks];
        this.borrowedcount = 0;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNumberLibrary() {
        return numberLibrary;
    }

    public boolean canBorrow(){
        return borrowedcount < borrowedBooks.length;
    }

    public void borrowBook(Book book){
        if(canBorrow()){
            borrowedBooks[borrowedcount] = book;
            borrowedcount++;
        }
    }
    public void returnBook(Book book){
        for(int i = 0; i < borrowedcount; i++){
            if(borrowedBooks[i] == book){
                borrowedBooks[i] = borrowedBooks[borrowedcount - 1];
                borrowedBooks[borrowedcount - 1] = null;
                borrowedcount--;
                break;
            }
        }
    }
}
