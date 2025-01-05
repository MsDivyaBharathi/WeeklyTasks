package Day5.Book;
import java.util.ArrayList;

public class Library implements ManagementSystem {
    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    @Override
    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    @Override
    public void removeBook(int bookId) {
        bookList.removeIf(book -> book.getBookID() == bookId);
    }

    @Override
    public Book searchBooks(String keyword) {
        for (Book book : bookList) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println("ID: " + book.getBookID() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
        }
    }

    @Override
    public void issueBook(int bookId) {
        for (Book book : bookList) {
            if (book.getBookID() == bookId && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    @Override
    public void returnBook(int bookId) {
        for (Book book : bookList) {
            if (book.getBookID() == bookId && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
