public class Main {

    // Inner class Book
    public static class Book {
        // Attributes
        private String title;
        private String author;
        private String isbn;
        private boolean available;

        // Method 1: Assign values to the book’s attributes
        public void setBookDetails(String title, String author, String isbn, boolean available) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.available = available;
        }

        // Method 2: Display the book's details
        public void displayBookDetails() {
            System.out.println("Title       : " + title);
            System.out.println("Author      : " + author);
            System.out.println("ISBN        : " + isbn);
            System.out.println("Availability: " + (available ? "Available" : "Borrowed"));
            System.out.println("------------------------------");
        }

        // Method 3: Mark the book as borrowed (only if available)
        public boolean borrowBook() {
            if (available) {
                available = false;
                System.out.println("You have successfully borrowed \"" + title + "\".");
                return true;
            } else {
                System.out.println("Sorry, \"" + title + "\" is currently borrowed.");
                return false;
            }
        }

        // Method 4: Return the book and mark it as available again
        public void returnBook() {
            available = true;
            System.out.println("You have returned \"" + title + "\". Thank you!");
        }

        // Optional: Getter for ISBN
        public String getISBN() {
            return isbn;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a new book instance
        Book myBook = new Book();
        myBook.setBookDetails("Effective Java", "Joshua Bloch", "978-0134685991", true);

        // Display book details
        myBook.displayBookDetails();

        // Try to borrow the book
        myBook.borrowBook();

        // Try to borrow again
        myBook.borrowBook();

        // Return the book
        myBook.returnBook();

        // Display final status
        myBook.displayBookDetails();
    }
}
