package Tasks6.Task1;

import Tasks6.Task1.BookModel.Publication;
import Tasks6.Task1.Person.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to our library!");
        ArrayList<User> users = User.createUsers();
        int count = 1;
        int maxCount = 3;
        boolean isAuthentication = false;
        User user = null;
        while (count <= maxCount) {
            System.out.println("Input login");
            String login = reader.readLine();
            System.out.println("Input password");
            String password = reader.readLine();
            for (User item : users) {
                if (item.authenticate(login, password)) {
                    System.out.println("Authentication is successful");
                    isAuthentication = true;
                    user = new User(item.getId(), item.getName(), item.getSurname(), login, password);
                    break;
                }
            }
            if (!isAuthentication) {
                System.out.println("invalid login or password. " + (maxCount - count) + " attempts left");
                count++;
            } else {
                break;
            }
        }
        if (isAuthentication) {
            System.out.println("Want to see the catalog enter 1, need a specific book enter 2");
            String answer = reader.readLine();
            if (answer.equals("1")) {
                user.viewCatalog();
            } else {
                try {
                    user.search();
                }catch (NullPointerException e){
                    System.out.println("no books meet your conditions");
                }
            }
        }
    }
}
