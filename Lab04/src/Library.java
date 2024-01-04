public class Library {
    public String libraryName;
    public Book book1, book2, book3;
    
    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
            default:
                break;
        }
    }
    
    public void removeBook(int slot) {
        switch (slot) {
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
            default:
                break;
        }
    }
    
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("");
        printBookDetails(book1);
        System.out.println("");
        printBookDetails(book2);
        System.out.println("");
        printBookDetails(book3);
    }
    
    public void checkBookAvailability(int slot) {
        if (slot == 1 & book1 != null) {
            System.out.println(book1.title + "is available");
        } else if (slot == 2 & book2 != null) {
            System.out.println(book2.title + "is available");
        } else if (slot == 3 & book3 != null) {
            System.out.println(book3.title + "is available");
        } else {
            System.out.println("Book in slot " + slot + " is not available");
        }
    }
    
    
    public void updateBookPrice(int slot, double newPrice) {
        if (slot == 1 & book1 != null) {
            System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
            book1.price = newPrice;
        } else if (slot == 2 & book2 != null) {
            System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
            book2.price = newPrice;
        } else if (slot == 3 & book3 != null) {
            System.out.println("Updated price of " + book3.title + " to $" + newPrice + ".");
            book3.price = newPrice;
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
            System.out.print("Available: ");
            if (book.isAvailable) {System.out.println("Yes");}
            else {System.out.println("No");}
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
