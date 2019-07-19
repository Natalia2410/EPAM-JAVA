package Tasks6.Task1.Person;

import Tasks6.Task1.BookModel.Publication;

import java.util.ArrayList;

public class Admin extends User {
    private ArrayList<Publication> publications;

    public Admin(int id, String name, String surname, String userName, String password, ArrayList<Publication> publications) {
        super(id, name, surname, userName, password);
        this.publications = publications;
    }
}
