// Person: Base class for individuals like Author and Reader
class Person {
    // Name of the person (common attribute)
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to identify the person
    public void whoyouare() {
        System.out.println("I am a person.");
    }
}

// Author: Inherits from Person, represents an author who owns books
class Author extends Person {
    // Array of books written by the author
    private Book[] books;
    private int bookCount;

    public Author(String name) {
        super(name);
        books = new Book[100];
        bookCount = 0;
    }

    public void new_book(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    public void show_book() {
        for (int i = 0; i < bookCount; i++) {
            books[i].display();
        }
    }

    @Override
    public void whoyouare() {
        System.out.println("I am an author.");
    }
}

// Reader: Inherits from Person, can borrow and return books
class Reader extends Person {
    private Book[] books;
    private int bookCount;

    public Reader(String name) {
        super(name);
        books = new Book[100];
        bookCount = 0;
    }

    public void purchase_book(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    public void borrow_book(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    public void return_book(Book book) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i] == book) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                break;
            }
        }
    }

    public void show_book() {
        for (int i = 0; i < bookCount; i++) {
            books[i].display();
        }
    }

    @Override
    public void whoyouare() {
        System.out.println("I am a reader.");
    }
}

// Book: Represents a general book with common properties
class Book {
    private String bookID;
    private String author;
    private String name;
    private double price;
    private String status;
    private String edition;
    private String dateOfPurchase;

    public Book(String bookID, String author, String name, double price, String status, String edition, String dateOfPurchase) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String get_title() {
        return name;
    }

    public String get_author() {
        return author;
    }

    public void change_owner(String newOwner) {
        // Not implemented
    }

    public String get_owner() {
        return "Owner info not implemented";
    }

    public void display() {
        System.out.println("Book Title: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Status: " + status);
        System.out.println("Edition: " + edition);
        System.out.println("Date of Purchase: " + dateOfPurchase);
    }

    public void update_status(String newStatus) {
        this.status = newStatus;
    }
}

class Journals extends Book {
    public Journals(String bookID, String author, String name, double price, String status, String edition, String dateOfPurchase)
    {
        super(bookID, author, name, price, status, edition, dateOfPurchase);
    }
}

class StudyBooks extends Book {
    public StudyBooks(String bookID, String author, String name, double price, String status, String edition, String dateOfPurchase) {
        super(bookID, author, name, price, status, edition, dateOfPurchase);
    }
}

class Magazines extends Book {
    public Magazines(String bookID, String author, String name, double price, String status, String edition, String dateOfPurchase) {
        super(bookID, author, name, price, status, edition, dateOfPurchase);
    }
}

// member_Record: Represents a library member's record and attributes
class member_Record {
    private String member_id;
    private String type;
    private String date_of_membership;
    private int no_books_issued;
    private int max_book_limit;
    private String name;
    private String address;
    private String phone_no;

    public void get_member() {
        // Implementation can be added based on requirement
    }

    public void inc_book_issued() {
        no_books_issued++;
    }

    public void dec_book_issued() {
        if (no_books_issued > 0) {
            no_books_issued--;
        }
    }

    public void pay_bill() {
        System.out.println("Bill paid.");
    }

    public String getMemberId() {
        return member_id;
    }

    public void setMemberId(String member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends member_Record {
}

class Faculty extends member_Record {
}

class Librarian {
    private String name;
    private String password;

    public void search_book() {
    }

    public void verify_member() {
    }

    public void issue_book() {
    }

    public void calculate_fine() {
    }

    public void create_bill() {
        System.out.println("Bill created.");
    }

    public void return_book() {
    }
}

class Library {
    private Book[] books;
    private Reader[] readers;
    private int bookCount;
    private int readerCount;

    public Library() {
        books = new Book[100];
        readers = new Reader[100];
        bookCount = 0;
        readerCount = 0;
    }

    public Book[] get_books() {
        return books;
    }

    public Reader[] get_reader() {
        return readers;
    }

    public void new_book(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    public void lend_book() {
    }

    public void take_back_book() {
    }

    public void show_book() {
        for (int i = 0; i < bookCount; i++) {
            books[i].display();
        }
    }
}

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Create book instances
        Book book1 = new StudyBooks("B001", "Prof. Smith", "Java Programming", 50.0, "available", "2nd", "2024-01-10");
        Book book2 = new Magazines("B002", "John Doe", "Tech Monthly", 10.0, "available", "April", "2024-04-01");

        // Add books to library
        library.new_book(book1);
        library.new_book(book2);

        // Show all books in the library
        library.show_book();

        // Create a reader
        Reader reader = new Reader("Yaren");
        reader.borrow_book(book1);

        // Show reader's books
        System.out.println("\nBooks borrowed by reader:");
        reader.show_book();
    }
}


