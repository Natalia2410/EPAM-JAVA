package Tasks6.Task1.BookModel;

import Tasks6.Task1.PublicationType;

public class Atlasmap extends Publication {
    public Atlasmap(PublicationType type, String title, int pages, String category, int year, String kindOfBook) {
        super(type, title, pages, category, year, kindOfBook);
    }

    @Override
    public String toString() {
        return "Atlasmap{" +
                "type=" + getType()+
                ", title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                ", category='" + getCategory() + '\'' +
                ", year=" + getYear() +
                ", kindOfBook='" + getKindOfBook() + '\'' +
                '}';
    }
}
