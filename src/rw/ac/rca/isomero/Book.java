package rw.ac.rca.isomero;

/**
 * Represents a book with its unique identifier, name, author, and price.
 * Implements {@link Comparable} to allow books to be compared based on price, name, author, and ID.
 * Provides methods to get and set book attributes.
 *
 * @author Livia
 * @see java.lang.Comparable
 * @see Object#hashCode
 * @see Object#equals
 */
public class Book implements Comparable {

    /**
     * Identifier of the book.
     */
    private Integer id;

    /**
     * Name of the book.
     */
    private String name;

    /**
     * Author of the book.
     */
    private String author;

    /**
     * Price of the book.
     */
    private Integer price;

    /**
     * Default constructor for creating a book instance without attributes.
     */
    public Book() {}

    /**
     * Constructs a book instance with the specified attributes.
     *
     * @param id     the identifier of the book
     * @param name   the name of the book
     * @param author the author of the book
     * @param price  the price of the book
     */
    public Book(Integer id, String name, String author, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * Gets the identifier of the book.
     *
     * @return the identifier of the book
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * An alternative method to get the identifier of the book.
     *
     * @return the identifier of the book
     */
    public Integer getIdOfBook() {
        return this.id;
    }

    /**
     * Sets the identifier of the book.
     *
     * @param identifier the new identifier of the book
     */
    public void setId(Integer identifier) {
        this.id = identifier;
    }

    /**
     * Gets the name of the book.
     *
     * @return the name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the book.
     *
     * @param name the new name of the book
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the price of the book.
     *
     * @return the price of the book
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the book.
     *
     * @param price the new price of the book
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the book, including its attributes.
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "id=" + this.id + " name=" + this.name + " author=" + this.author + " price=" + this.price;
    }

    /**
     * Compares this book to another book based on price, name, author, and ID in that order.
     *
     * @param o the object to be compared
     * @return a negative integer, zero, or a positive integer as this book is less than, equal to,
     *         or greater than the specified book
     */
    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        if (this.price.compareTo(book.price) != 0) {
            return this.price.compareTo(book.price);
        }
        if (this.name.compareTo(book.name) != 0) {
            return this.name.compareTo(book.name);
        }
        if (this.author.compareTo(book.author) != 0) {
            return this.author.compareTo(book.author);
        }
        return this.id.compareTo(book.id);
    }

    /**
     * Indicates whether some other object is "equal to" this one based on its attributes.
     *
     * @param o the object to compare
     * @return {@code true} if this book is equal to the specified object; {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return this.id.equals(b.id) && this.name.equals(b.name) && this.author.equals(b.author) && this.price.equals(b.price);
    }

    /**
     * Returns a hash code value for this book based on its attributes.
     *
     * @return a hash code value for this book
     */
    @Override
    public int hashCode() {
        return this.id.hashCode() + this.name.hashCode() + this.author.hashCode() + this.price.hashCode();
    }
}
