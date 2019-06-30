package ProgrammingWithClasses.Block2.Task4;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(2345, "ruble");
        Account account2 = new Account(6543, "euro");
        Account account3 = new Account(7654, "ruble");
        Account account4 = new Account(6354, "ruble");
        Account account5 = new Account(1234, "dollar");
        Account account6 = new Account(4567, "ruble");
        Account account7 = new Account(6478, "euro");
        Account account8 = new Account(1763, "ruble");
        Account account9 = new Account(3546, "ruble");
        Account account10 = new Account(6972, "dollar");

        Client client1 = new Client(1, "Bob", new Account[]{account1, account2, account3});
        Client client2 = new Client(2, "Tom", new Account[]{account4, account5});
        Client client3 = new Client(3, "Liza", new Account[]{account6, account7, account8, account9});
        Client client4 = new Client(4, "Mike", new Account[]{account10});

        Bank bank = new Bank("BSB BANK", new Client[]{client1, client2, client3, client4});
        System.out.println("All account in bank: ");
        System.out.println(bank);
        System.out.println("client " + client1.getId() + " : " + client1.getName());
        client1.getAccountWithGivenalance(1000);
        System.out.println("client " + client2.getId() + " : " + client2.getName());
        client2.getAccountWithGivenalance(200);
        System.out.println("client " + client3.getId() + " : " + client3.getName());
        client3.getAccountWithGivenalance(500);
        System.out.println("client " + client4.getId() + " : " + client4.getName());
        client4.getAccountWithGivenalance(1290);
//client1:
        System.out.println("client " + client1.getId() + " : " + client1.getName() + " before sort:");
        System.out.println(client1);
        System.out.println("client " + client1.getId() + " : " + client1.getName() + " after sort:");
        client1.sort();
        System.out.println(client1);
        System.out.println("\nTotal amount:");
        System.out.println("client " + client1.getId() + "," + client1.getName() + ": " + client1.getTotalAmount());
        System.out.println("\nPositive amount:");
        System.out.println("client " + client1.getId() + "," + client1.getName() + ": " + client1.getPositiveAmount());
        System.out.println("\nNegative amount:");
        System.out.println("client " + client1.getId() + "," + client1.getName() + ": " + client1.getNegativeAmount());
    }
}
