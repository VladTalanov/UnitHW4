public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
    void addBooks(String id, Book book);
}