package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1111", 1925);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "2222", 1960);
        Book b3 = new Book("The Great Alone", "Kristin Hannah", "3333", 2018);
        Book b4 = new Book("1864", "Unknown Author", "4444", 1864);
        Book b5 = new Book("Moby Dick", "Herman Melville", "5555", 1851);

        catalog.addBook(b1);
        catalog.addBook(b2);
        catalog.addBook(b3);
        catalog.addBook(b4);
        catalog.addBook(b5);

        System.out.println("Search results for 'Great':");
        for (LibraryItem item : catalog.findByTitle("Great")) {
            System.out.println(item);
        }

        System.out.println("\nRemoving book with ISBN 2222...");
        catalog.removeBook("2222");

        System.out.println("\nAll items in catalog after removal:");
        for (LibraryItem item : catalog.getBooks()) {
            System.out.println(item);
        }
    }

    interface LibraryItem {
        String getTitle();
        String getUniqueId();
    }

    static class Book implements LibraryItem {
        private String title;
        private String author;
        private String isbn;
        private int year;

        public Book(String title, String author, String isbn, int year) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.year = year;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getUniqueId() {
            return isbn;
        }

        @Override
        public String toString() {
            return "Book: '" + title + "' (" + author + ", " + year + ")";
        }
    }

    static class LibraryCatalog {
        private static final LibraryCatalog INSTANCE = new LibraryCatalog();
        private List<LibraryItem> books = new ArrayList<>();

        private LibraryCatalog() {}

        public static LibraryCatalog getInstance() {
            return INSTANCE;
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(String isbn) {
            books.removeIf(item -> item.getUniqueId().equals(isbn));
        }

        public List<LibraryItem> findByTitle(String title) {
            List<LibraryItem> result = new ArrayList<>();
            for (LibraryItem item : books) {
                if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    result.add(item);
                }
            }
            return result;
        }

        public List<LibraryItem> getBooks() {
            return books;
        }
    }
}
