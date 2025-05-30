package bookkk;

public class Bookkk {
    private String title;
    private String author;
    private int copies;

    // Constructor
    public Bookkk(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    // Displays book information
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available Copies: " + copies);
    }

    // Reduces the number of copies if possible
    public boolean decrementCopies(int count) {
        if (count <= copies) {
            copies -= count;
            return true;
        } else {
            System.out.println("Not enough copies of \"" + title + "\" to loan " + count + " copies.");
            return false;
        }
    }

    // Getter for title (optional but useful)
    public String getTitle() {
        return title;
    }
}
