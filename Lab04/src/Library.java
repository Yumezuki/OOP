public class Library {
    public String libraryName;
    public Book book1, book2, book3;
    
    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1 -> book1 = book;
            case 2 -> book2 = book;
            case 3 -> book3 = book;
        }
    }
    
    public void removeBook(int slot) {
        switch (slot) {
            case 1 -> book1 = null;
            case 2 -> book2 = null;
            case 3 -> book3 = null;
        }
    }
    
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Publisher: " + book1.publisher);
        System.out.println("Year Published: " + book1.yearPublished);
        System.out.println("Price: $" + book1.price);
        System.out.println("Available: " + book1.isAvailable);
        System.out.println("");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Publisher: " + book2.publisher);
        System.out.println("Year Published: " + book2.yearPublished);
        System.out.println("Price: $" + book2.price);
        System.out.println("Available: " + book2.isAvailable);
        System.out.println("");
        System.out.println("Title: " + book3.title);
        System.out.println("Author: " + book3.author);
        System.out.println("Publisher: " + book3.publisher);
        System.out.println("Year Published: " + book3.yearPublished);
        System.out.println("Price: $" + book3.price);
        System.out.println("Available: " + book3.isAvailable);
    }
    
    public void checkBookAvailability(int slot) {
        if (slot == 1 & book1 != null) {
            System.out.println(book1.title + "is available");
        } else if (slot == 2 & book2 != null) {
            System.out.println(book2.title + "is available");
        } else if (slot == 2 & book3 != null) {
            System.out.println(book3.title + "is available");
        } else {
            System.out.println("Book in slot " + slot + " is not available");
        }
    }
    
    
    public void updateBookPrice(int slot, double newPrice) {
        if (slot == 1 & book1 != null) {
            System.out.println("Updated price of " + book1.title + " to " + newPrice);
        } else if (slot == 2 & book2 != null) {
            System.out.println("Updated price of " + book2.title + " to " + newPrice);
        } else if (slot == 2 & book3 != null) {
            System.out.println("Updated price of " + book3.title + " to " + newPrice);
        } else {
            System.out.println("No book in this slot.");
        }
    }
    
    public void printBookDetails(Book book) {
        if (book != null) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            System.out.println("Available: " + book.isAvailable);
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
