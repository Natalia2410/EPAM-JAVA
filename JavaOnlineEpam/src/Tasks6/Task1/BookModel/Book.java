package Tasks6.Task1.BookModel;

import Tasks6.Task1.PublicationType;

public abstract class Book extends Publication {
    private String author;
    private int copies;

    public Book(PublicationType type, String title, int pages, String category, int year, String kindOfBook, String author, int copies) {
        super(type, title, pages, category, year, kindOfBook);
        this.author = author;
        this.copies = copies;
    }
    public Book(PublicationType type, String title, int pages, String category, int year, String kindOfBook) {
        super(type, title, pages, category, year, kindOfBook);
        this.author = author;
        this.copies = copies;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
    @Override
    public String toString() {
        return "Book{" +
                "type=" + getType()+
                ", title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                ", category='" + getCategory() + '\'' +
                ", year=" + getYear() +
                ", kindOfBook='" + getKindOfBook() + '\'' +
                "author='" + author + '\'' +
                ", copies=" + copies +
                '}';
    }
}
