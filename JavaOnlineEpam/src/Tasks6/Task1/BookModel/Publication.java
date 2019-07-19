package Tasks6.Task1.BookModel;

import Tasks6.Task1.PublicationType;

public abstract class Publication {
    private PublicationType type;
    private String title;
    private int pages;
    private String category;
    private int year;
    private String kindOfBook;

    public Publication(PublicationType type, String title, int pages, String category, int year, String kindOfBook) {
        this.type = type;
        this.title = title;
        this.pages = pages;
        this.category = category;
        this.year = year;
        this.kindOfBook = kindOfBook;
    }

    public PublicationType getType() {
        return type;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKindOfBook() {
        return kindOfBook;
    }

    public void setKindOfBook(String kindOfBook) {
        this.kindOfBook = kindOfBook;
    }
}
