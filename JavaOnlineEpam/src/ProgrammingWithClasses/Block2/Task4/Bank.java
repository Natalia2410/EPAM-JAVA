package ProgrammingWithClasses.Block2.Task4;

import java.util.Arrays;

public class Bank {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Client[] clients;

    public Bank(String name, Client[] clients) {
        this.name = name;
        this.clients = clients;

    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}
