package Tasks6.Task1;

import Tasks6.Task1.BookModel.*;

public class PublicationFactory {
    public Publication createPublication(PublicationType type, String title, int pages, String category, int year, String kindOfBook) {
        Publication publication = null;
        switch (type) {
            case book:
                publication = new Book(type, title, pages, category, year, kindOfBook) {
                };
                break;
            case journal:
                publication = new Journal(type, title, pages, category, year, kindOfBook);
                break;
            case newspaper:
                publication = new Newspaper(type, title, pages, category, year, kindOfBook);
                break;
            case atlasmap:
                publication = new Atlasmap(type, title, pages, category, year, kindOfBook);
                break;
        }
        return publication;
    }

    public Publication createPublication(PublicationType type, String title, int pages, String category, int year, String kindOfBook, String author, int copies) {
        Publication publication = null;
        switch (type) {
            case book:
                publication = new Book(type, title, pages, category, year, kindOfBook, author, copies) {
                };
                break;
            case journal:
                publication = new Journal(type, title, pages, category, year, kindOfBook);
                break;
            case newspaper:
                publication = new Newspaper(type, title, pages, category, year, kindOfBook);
                break;
            case atlasmap:
                publication = new Atlasmap(type, title, pages, category, year, kindOfBook);
                break;
        }
        return publication;
    }

    public Publication createPublication(PublicationType type, String title, int pages, String category, int year, String kindOfBook, int number) {
        Publication publication = null;
        switch (type) {
            case book:
                publication = new Book(type, title, pages, category, year, kindOfBook) {
                };
                break;
            case journal:
                publication = new Journal(type, title, pages, category, year, kindOfBook, number);
                break;
            case newspaper:
                publication = new Newspaper(type, title, pages, category, year, kindOfBook, number);
                break;
            case atlasmap:
                publication = new Atlasmap(type, title, pages, category, year, kindOfBook);
                break;
        }
        return publication;
    }


    public PublicationType getPublicationType(String type) {
        PublicationType publicationType = null;
        switch (type.toLowerCase()) {
            case "book":
                publicationType = PublicationType.book;
                break;
            case "atlasmap":
                publicationType = PublicationType.atlasmap;
                break;
            case "newspaper":
                publicationType = PublicationType.newspaper;
                break;
            case "journal":
                publicationType = PublicationType.journal;
                break;
        }
        return publicationType;
    }
}
