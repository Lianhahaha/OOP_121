package bookkk;

import bookkk.Bookkk;
import java.util.ArrayList;

public class Library {
    private ArrayList<Bookkk> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Adds a book to the collection
    public void addBook(Bookkk book) {
        books.add(book);
    }

    // Attempts to loan out copies of a book
    public void loanBook(Bookkk book, int loanCount) {
        System.out.println("\nAttempting to loan " + loanCount + " copies of: " + book.getTitle());
        boolean success = book.decrementCopies(loanCount);
        if (success) {
            System.out.println("Loan successful.");
        } else {
            System.out.println("Loan failed.");
        }
    }

    // Displays all books in the library
    public void displayLibrary() {
        System.out.println("\nLibrary Inventory:");
        for (Bookkk book : books) {
            book.displayInfo();
        }
    }
}
