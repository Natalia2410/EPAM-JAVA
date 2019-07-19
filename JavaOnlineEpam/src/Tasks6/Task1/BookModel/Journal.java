package Tasks6.Task1.BookModel;

import Tasks6.Task1.PublicationType;

public class Journal extends Publication {
    private int number;

    public Journal(PublicationType type, String title, int pages, String category, int year, String kindOfBook, int number) {
        super(type, title, pages, category, year, kindOfBook);
        this.number = number;
    }
    public Journal(PublicationType type, String title, int pages, String category, int year, String kindOfBook) {
        super(type, title, pages, category, year, kindOfBook);
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Journal{" +
                "type=" + getType() +
                ", title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                ", category='" + getCategory() + '\'' +
                ", year=" + getYear() +
                ", kindOfBook='" + getKindOfBook() + '\'' +
                "number=" + number +
                '}';
    }
}
