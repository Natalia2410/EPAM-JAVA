package Tasks6.Task1.Person;

import Tasks6.Task1.BookModel.Book;
import Tasks6.Task1.BookModel.Catalog;
import Tasks6.Task1.BookModel.Publication;
import Tasks6.Task1.PublicationException;
import Tasks6.Task1.PublicationFactory;
import Tasks6.Task1.PublicationType;
import Tasks6.Task1.Validator.ValidatorInputData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class User {
    protected int id;
    protected String name;
    protected String surname;
    private ArrayList<String> email;
    protected String userName;
    protected String password;

    public User(int id, String name, String surname, String userName, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = new ArrayList<>();
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean authenticate(String un, String pw) {
        return un.equals(this.userName) && pw.equals(this.password);
    }

    public void viewCatalog() throws IOException {
        Catalog catalog = new Catalog();
        catalog.setPublications(catalog.createCatalog());
        System.out.println("All books in library:");
        catalog.printAll();
    }

    public ArrayList<Publication> searchBook(String author) throws IOException, NullPointerException {
        Catalog catalog = new Catalog();
        catalog.setPublications(catalog.createCatalog());
        ArrayList<Publication> publications = new ArrayList<>();
        Book book = null;
        for (int i = 0; i < catalog.getPublications().size(); i++) {
            if (catalog.getPublications().get(i) instanceof Book) {
                book = (Book) catalog.getPublications().get(i);
            }
            if (book.getAuthor().equalsIgnoreCase(author)) {
                publications.add(book);
            }
        }
        return publications;
    }


    public ArrayList<Publication> searchBook(String author, String title) throws IOException, NullPointerException {
        Catalog catalog = new Catalog();
        catalog.setPublications(catalog.createCatalog());
        ArrayList<Publication> publications = new ArrayList<>();
        Book book = null;
        for (int i = 0; i < catalog.getPublications().size(); i++) {
            if (catalog.getPublications().get(i) instanceof Book) {
                book = (Book) catalog.getPublications().get(i);
            }
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                publications.add(catalog.getPublications().get(i));
            }
        }
        return publications;
    }

    public ArrayList<Publication> searchBook(PublicationType type) throws IOException, NullPointerException {
        Catalog catalog = new Catalog();
        ArrayList<Publication> publications = new ArrayList<>();
        catalog.setPublications(catalog.createCatalog());
        for (int i = 0; i < catalog.getPublications().size(); i++) {
            if (catalog.getPublications().get(i).getType().equals(type)) {
                publications.add(catalog.getPublications().get(i));
            }
        }
        return publications;
    }

    public ArrayList<Publication> searchBook(PublicationType type, String title) throws IOException, NullPointerException {
        Catalog catalog = new Catalog();
        catalog.setPublications(catalog.createCatalog());
        ArrayList<Publication> publications = new ArrayList<>();
        for (int i = 0; i < catalog.getPublications().size(); i++) {
            if (catalog.getPublications().get(i).getTitle().equalsIgnoreCase(title) && catalog.getPublications().get(i).getType().equals(type)) {
                publications.add(catalog.getPublications().get(i));
            }
        }
        return publications;
    }

    public ArrayList<Publication> searchBook(PublicationType type, String author, String title) throws IOException, NullPointerException {
        Catalog catalog = new Catalog();
        catalog.setPublications(catalog.createCatalog());
        ArrayList<Publication> publications = null;
        Book book = null;
        for (int i = 0; i < catalog.getPublications().size(); i++) {
            if (catalog.getPublications().get(i) instanceof Book) {
                book = (Book) catalog.getPublications().get(i);
            }
            if (book.getAuthor().equalsIgnoreCase(author) && book.getType().equals(type) && book.getTitle().equalsIgnoreCase(title)) {
                publications.add(book);
            }
        }
        return publications;
    }

    public void search() throws IOException, NullPointerException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PublicationFactory publicationFactory = new PublicationFactory();
        ValidatorInputData validatorInputData = new ValidatorInputData();
        System.out.println("search criterion:");
        System.out.println("type - 1");
        System.out.println("author - 2");
        System.out.println("type, title - 3");
        System.out.println("author, title - 4");
        System.out.println("type, author, title - 5");
        String menu = reader.readLine();
        String author = "";
        String type = null;
        String title = "";
        ArrayList<Publication> list = new ArrayList<>();
        if (menu.equals("1")) {
            System.out.println("Input type: (book, atlasmap, newspaper, journal)");
            type = reader.readLine();
            try {
                validatorInputData.validateInputPublicationType(type);
                list = searchBook(publicationFactory.getPublicationType(type));
                if (!list.equals(null)) {
                    User.printBooks(list);
                }
            } catch (PublicationException e) {
                System.out.println(e.getMessage());
            }

        } else if (menu.equals("2")) {
            System.out.println("Input author");
            author = reader.readLine();
            list = searchBook(author);
            if (!list.equals(null)) {
                User.printBooks(list);
            }
        } else if (menu.equals("3")) {
            System.out.println("input type: (book, atlasmap, newspaper, journal)");
            type = reader.readLine();
            try {
                validatorInputData.validateInputPublicationType(type);
                System.out.println("Input title");
                title = reader.readLine();
                list = searchBook(publicationFactory.getPublicationType(type), title);
                if (!list.equals(null)) {
                    User.printBooks(list);
                }
            } catch (PublicationException e) {
                System.out.println(e.getMessage());
            }
        } else if (menu.equals("4")) {
            System.out.println("Input author");
            author = reader.readLine();
            System.out.println("Input title");
            title = reader.readLine();
            list = searchBook(author, title);
            if (!list.equals(null)) {
                User.printBooks(list);
            }
        } else {
            System.out.println("input type: (book, atlasmap, newspaper, journal)");
            type = reader.readLine();
            try {
                validatorInputData.validateInputPublicationType(type);
                System.out.println("Input author");
                author = reader.readLine();
                System.out.println("Input title");
                title = reader.readLine();
                list = searchBook(publicationFactory.getPublicationType(type), author, title);
                if (!list.equals(null)) {
                    User.printBooks(list);
                }
            } catch (PublicationException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static ArrayList<User> createUsers() throws IOException {
        ArrayList<User> users = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("loginpassword"));
        String line;
        String[] words;
        while ((line = reader.readLine()) != null) {
            words = line.split("\\s+");
            String login = words[0];
            String password = words[1];
            int id = Integer.parseInt(words[2]);
            String name = words[3];
            String surname = words[4];
            User user = new User(id, name, surname, login, password);
            users.add(user);
        }
        return users;
    }

    public static void printBooks(ArrayList<Publication> list) {
        for (Publication item : list) {
            System.out.println(item);
        }
    }
}
