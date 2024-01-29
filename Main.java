public class Main {
    public static void main(String[] args) {
        Library library = new Library(10, 5);
        Book book1 = new Book("Мастер и Маргарита", "Булгагов", "г.Москва", 2005, 3);
        Book book2 = new Book("Капитанская дочка", "Пушкин", "г.Москва", 2006, 4);
        library.addBook(book1);
        library.addBook(book2);
        LibraryUser libraryUser = new LibraryUser("Паша Ивангай", "АлексейПушкинов", 3, 3);
        if(library.leandBook(book1, libraryUser)){
            System.out.println("Книга была выдана");
        }
        else{
            System.out.println("Нельзя выдать книгу!");
        }
        libraryUser.returnBook(book1);
    }
}

