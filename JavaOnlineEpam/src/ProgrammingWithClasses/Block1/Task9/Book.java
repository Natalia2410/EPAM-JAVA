package ProgrammingWithClasses.Block1.Task9;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int countOfPages;
    private int price;
    private String typeOfBinding;

    public Book(int id, String name, String author, String publisher, int yearOfPublication, int countOfPages, int price, String typeOfBinding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.countOfPages = countOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{"
                + "id = " + id
                + ", name = " + name
                + ", author = " + author
                + ", publisher = " + publisher
                + ", yearOfPublication = " + yearOfPublication
                + ", countOfPages = " + countOfPages
                + ", price = " + price
                + ", typeOfBinding = " + typeOfBinding
                + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
