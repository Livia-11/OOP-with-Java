package rw.ac.rca.isomero;

import java.util.*;

/**
 * The entry point of the application, demonstrating the usage of the {@link Book} class.
 * The program creates a set of books, adds book instances to the set, and displays their details.
 * This illustrates the behavior of the {@code hashCode} and {@code equals} methods in ensuring
 * unique elements in a {@link HashSet}.
 *
 * @see Book
 * @see HashSet
 */
public class Program {

    /**
     * The main method to run the program.
     * Demonstrates the creation and manipulation of a {@link Set} of {@link Book} objects.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Creating book instances
        Book b1 = new Book(1, "OOP WITH JAVA", "Mike", 1000);
        Book b2 = new Book(2, "OOP WITH JAVA", "Mike", 1000);
        Book b3 = new Book(4, "Advanced JAVA", "Annabelle", 2000);
        Book b4 = new Book(2, "Advanced JAVA", "Annabelle", 3000);
        Book b5 = new Book(2, "Advanced JAVA", "Mike", 2000);

        // Using a HashSet to store books (ensures no duplicates based on hashCode and equals)
        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        // Printing the details of each unique book in the set
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
