package LibraryManagementSystem;

public class UseLibrary {
    public static void main(String[] args) {
        Book b1=new Book("Life is a myth","Yograj",99);
        Book b2=new Book("Existance of God","Yograj",999);
        Book b3=new Book("Humanity: A bane for Nature","Yograj",54);
        Book b4=new Book("Robots: Savior of the Earth","Yograj", 270);
        Book b5=new Book("Life is a myth","Yograj",99);
        Book b6=new Book("Existance of God","Yograj",999);

        System.out.println("Now i will have to create a new Library object to store boooks data in it");
        Library library=new Library();

        System.out.println("Book 1 added:"+library.addBook(b1));
        System.out.println("Book 2 added:"+library.addBook(b2));
        System.out.println("Book 3 added:"+library.addBook(b3));
        System.out.println("Book 4 added:"+library.addBook(b4));
        System.out.println("Book 5 added:"+library.addBook(b5));
        System.out.println("Book 6 added:"+library.addBook(b6));


        System.out.println("All books in the library are:"+library.getAllBooks());

        System.out.println("Total no of books in the library are:"+library.getBookCount());

        System.out.println("Now i m gonna remove books from the library!");
        library.Delete(b4);
        System.out.println("All books in the library are:"+library.getAllBooks());
        System.out.println("Total no of books in the library are:"+library.getBookCount());

    }
}
