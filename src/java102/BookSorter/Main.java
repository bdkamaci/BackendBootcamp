package java102.BookSorter;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] books2 = {
                new Book("To Kill a Mockingbird", 281, "Harper Lee", 1960),
                new Book("1984", 328, "George Orwell", 1949),
                new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 1925),
                new Book("The Catcher in the Rye", 277, "J.D. Salinger", 1951),
                new Book("Pride and Prejudice", 279, "Jane Austen", 1813),
                new Book("The Hobbit", 310, "J.R.R. Tolkien", 1937),
                new Book("To the Lighthouse", 209, "Virginia Woolf", 1927),
                new Book("The Picture of Dorian Gray", 254, "Oscar Wilde", 1890),
                new Book("Frankenstein", 280, "Mary Shelley", 1818),
                new Book("Moby-Dick", 625, "Herman Melville", 1851)
        };

        // Convert array to List
        List<Book> booksList = Arrays.asList(books2);

        // User Input for SortChoice
        System.out.print("How would you like to sort the books (1- By Title, 2- By Author, 3- By Publish Date, 4- By # of Page): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Set<Book> books = new TreeSet<>();
                books.addAll(booksList);
                System.out.println("\nBooks sorted by title:");
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            case 2:
                Set<Book> bookSetByAuthorName = new TreeSet<>(Comparator.comparing(Book::getAuthorName));
                bookSetByAuthorName.addAll(booksList);
                System.out.println("\nBooks sorted by author:");
                for (Book book : bookSetByAuthorName) {
                    System.out.println(book);
                }
                break;
            case 3:
                Set<Book> bookSetByPublishDate = new TreeSet<>(Comparator.comparingInt(Book::getPublishDate));
                bookSetByPublishDate.addAll(booksList);
                System.out.println("\nBooks sorted by publish date:");
                for (Book book : bookSetByPublishDate) {
                    System.out.println(book);
                }
                break;
            case 4:
                Set<Book> bookSetByPageNumber = new TreeSet<>(Comparator.comparingInt(Book::getPageNum));
                bookSetByPageNumber.addAll(booksList);
                System.out.println("\nBooks sorted by number of pages:");
                for (Book book : bookSetByPageNumber) {
                    System.out.println(book);
                }
                break;
        }

    }
}
