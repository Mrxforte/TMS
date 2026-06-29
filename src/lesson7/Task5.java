package lesson7;

public class Task5 {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Leo Tolstoy", 1869);
        Book book2 = new Book("The Crime and Punishment", "Fyodor Dostoevsky", 1866);
        Book book3 = new Book("The Master and Margarita", "Mikhail Bulgakov", 1967);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: '" + title + "' (" + author + ", " + year + ")";
    }
}

