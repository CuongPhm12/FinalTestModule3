package model;

public class Book {
    private int idBook ;
    private String name;
    private String author;
    private String description;
    private int quantity;

    public Book(String name, String author, String description, int quantity) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
    }

    public Book(int idBook, String name, String author, String description, int quantity) {
        this.idBook = idBook;
        this.name = name;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
    }

    public Book() {
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
