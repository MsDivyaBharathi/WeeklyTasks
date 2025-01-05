package Day5.Book;

public interface ManagementSystem {

    void addBook(Book newBook);
    void removeBook(int bookId);
    Book searchBooks(String keyword);
    void displayBooks();
    void issueBook(int bookId);
    void returnBook(int bookId);
}

