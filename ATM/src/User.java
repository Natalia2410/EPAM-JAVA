import Validator.CardException;
import Validator.ValidatorDataInFile;
import Validator.ValidatorInputData;

import java.io.*;
import java.util.ArrayList;

public class User {
    private Card card;

    public User(Card card) {
        this.card = card;
    }

    public User() {

    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "User{" +
                "card=" + card +
                '}';
    }

    public boolean authenticate(String cardNumber, String password) {
        return cardNumber.equals(card.getCardNumber()) && password.equals(card.getPassword());
    }

    public Card userAuthenticate() throws IOException, CardException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ValidatorInputData validatorInputData = new ValidatorInputData();
        int count = 1;
        int maxCount = 3;
        Card card = null;
        boolean isAuthentication = false;
        ArrayList<User> users = new ArrayList<>();
        users = User.createUsers();
        while (count <= maxCount) {
            System.out.println("Enter the card number in format ХХХХ-ХХХХ-ХХХХ-ХХХХ");
            String cardNumber = reader.readLine();
            validatorInputData.validateInputData(cardNumber);
            System.out.println("Input password");
            String password = reader.readLine();
            for (User item : users) {
                if (item.authenticate(cardNumber, password)) {
                    System.out.println("Authentication is successful");
                    card = new Card(item.getCard().getCardNumber(), item.getCard().getPassword(), item.getCard().getBalance());
                    isAuthentication = true;
                    break;
                }
            }
            if (!isAuthentication) {
                System.out.println("invalid cardNumber or password. " + (maxCount - count) + " attempts left");
                if (count == maxCount) {
                    System.out.println("card is locked");
                    try {
                        Thread.sleep(86400000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    count++;
                }
            } else {
                break;
            }
        }
        return card;
    }

    public static ArrayList<User> createUsers() throws IOException {
        ArrayList<User> users = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("users"));
        String line;
        int count = 1;
        String[] words;
        ValidatorDataInFile validatorDataInFile = new ValidatorDataInFile();
        while ((line = reader.readLine()) != null) {
            if (!line.matches("\\d+\\.\\d+")) {
                words = line.split("\\s+");
                String cardNumber = words[0];
                try {
                    validatorDataInFile.validateCardNumber(cardNumber);
                } catch (CardException e) {
                    System.out.println(e.getMessage() + "in string " + count);
                }
                String password = words[1];
                try {
                    validatorDataInFile.validatePasswort(password);
                } catch (CardException e) {
                    System.out.println(e.getMessage() + "in string " + count);
                }
                String bal = words[2];
                try {
                    validatorDataInFile.validateBalance(bal);
                } catch (CardException e) {
                    System.out.println(e.getMessage() + "in string " + count);
                }
                count++;
                double balance = Double.parseDouble(bal);
                Card card = new Card(cardNumber, password, balance);
                User user = new User(card);
                users.add(user);
            }
        }
        return users;
    }

    public double checkBalance() {
        return card.getBalance();
    }

    public void withdrawMoney(int sum) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("users"));
        String line = reader.readLine();
        String[] words;
        String str = "";
        double balance = 0.0;
        ValidatorDataInFile validatorDataInFile = new ValidatorDataInFile();
        FileWriter fw = null;
        BufferedReader br = null;
        FileWriter fw1 = null;
        try {
            validatorDataInFile.validateBalanceATM(line);
            balance = Double.parseDouble(line);
            ATM atm = new ATM(balance);
            if (sum < atm.getBalance() && sum < card.getBalance()) {
                card.setBalance(card.getBalance() - sum);
                balance = balance - sum;
                System.out.println("removed " + sum + ". Account balance " + card.getBalance() + ". The balance ATM " + balance);
                fw = new FileWriter("qwe");
                line = String.valueOf(balance) + "\n";
                fw.write(line);
                while ((line = reader.readLine()) != null) {
                    words = line.split("\\s+");
                    String cardNumber = words[0];
                    if (cardNumber.equals(card.getCardNumber())) {
                        str += card.getCardNumber() + " " + card.getPassword() + " " + card.getBalance() + "\n";
                        fw.write(str);
                        str = "";
                    } else {
                        fw.write(line + "\n");
                    }
                }
                fw.close();
                br = new BufferedReader(new FileReader("qwe"));
                fw1 = new FileWriter("users");
                while ((line = br.readLine()) != null) {
                    fw1.write(line + "\n");
                }
                br.close();
                fw1.close();
            } else if (sum > atm.getBalance()) {
                System.out.println("Insufficient funds at ATM");
            } else if (sum > card.getBalance()) {
                System.out.println("Insufficient funds in the account\n");
            }
        } catch (CardException e) {
            System.out.println(e.getMessage());
        }
    }

    public void depositAccount(int sum) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("users"));
        String line = reader.readLine();
        String[] words;
        String str = "";
        FileWriter fw = null;
        BufferedReader br = null;
        FileWriter fw1 = null;
        final int MAX_SUM = 1000000;
        if (sum < MAX_SUM) {
            card.setBalance(card.getBalance() + sum);
            System.out.println("fill " + sum + ". Account balance " + card.getBalance());
            fw = new FileWriter("qwe");
            fw.write(line +"\n");
            while ((line = reader.readLine()) != null) {
                words = line.split("\\s+");
                String cardNumber = words[0];
                if (cardNumber.equals(card.getCardNumber())) {
                    str += card.getCardNumber() + " " + card.getPassword() + " " + card.getBalance() + "\n";
                    fw.write(str);
                    str = "";
                } else {
                    fw.write(line + "\n");
                }
            }
            fw.close();
            br = new BufferedReader(new FileReader("qwe"));
            fw1 = new FileWriter("users");
            while ((line = br.readLine()) != null) {
                fw1.write(line + "\n");
            }
            br.close();
            fw1.close();
        } else {
            System.out.println("maximum deposit amount " + MAX_SUM);
        }
    }
}
