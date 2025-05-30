package bookkk;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Bookkk book1 = new Bookkk("1984", "George Orwell", 4);
        Bookkk book2 = new Bookkk("The Hobbit", "J.R.R. Tolkien", 2);

        // Add to library
        library.addBook(book1);
        library.addBook(book2);

        // Display inventory before loan
        System.out.println("Before loan:");
        library.displayLibrary();

        // Perform a loan
        library.loanBook(book1, 2); // Loan 2 copies of "1984"

        // Display inventory after loan
        System.out.println("\nAfter loan:");
        library.displayLibrary();
    }
}
