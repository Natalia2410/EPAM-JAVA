package ProgrammingWithClasses.Block2.Task4;

import java.util.Arrays;

public class Client {
    private int id;
    private String name;
    private Account[] accounts;
    private int countOfAccount;

    public Client(int id, String name, Account[] accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
        this.countOfAccount = accounts.length;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                ", countOfAccount=" + countOfAccount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getCountOfAccount() {
        return countOfAccount;
    }

    public void setCountOfAccount(int countOfAccount) {
        this.countOfAccount = countOfAccount;
    }

    public void getAccountWithGivenalance(double balance) {
        boolean isContains = false;
        double dollarRate = 2.04;
        double euroRate = 2.33;
        for (int i = 0; i < countOfAccount; i++) {
            double realBalance = accounts[i].getBalance();
            if (!accounts[i].isBlock()) {
                if (accounts[i].getCurrency().equalsIgnoreCase("dollar")) {
                    realBalance *= dollarRate;
                } else if (accounts[i].getCurrency().equalsIgnoreCase("euro")) {
                    realBalance += euroRate;
                }
                if (realBalance > balance) {
                    System.out.println("Client " + id + ":" + name + " has account with balance greater than specified: " + accounts[i]);
                    isContains = true;
                }
            }
        }
        if (!isContains) {
            System.out.println("the balance on all accounts is less than a specified");
        }
    }

    public void sort() {
        Arrays.sort(accounts, new AccountComparatorBalance());
    }

    public double getTotalAmount(){
        double dollarRate = 2.04;
        double euroRate = 2.33;
        double totalAmount = 0;
        for (int i = 0; i < countOfAccount; i++) {
            double realBalance = accounts[i].getBalance();
                if (accounts[i].getCurrency().equalsIgnoreCase("dollar")) {
                    realBalance *= dollarRate;
                } else if (accounts[i].getCurrency().equalsIgnoreCase("euro")) {
                    realBalance *= euroRate;
                }
                totalAmount+=realBalance;
        }
        return totalAmount;
    }

    public double getPositiveAmount(){
        double dollarRate = 2.04;
        double euroRate = 2.33;
        double totalAmount = 0;
        for (int i = 0; i < countOfAccount; i++) {
            if(!accounts[i].isBlock()) {
                double realBalance = accounts[i].getBalance();
                if (accounts[i].getCurrency().equalsIgnoreCase("dollar")) {
                    realBalance *= dollarRate;
                } else if (accounts[i].getCurrency().equalsIgnoreCase("euro")) {
                    realBalance *= euroRate;
                }
                totalAmount += realBalance;
            }
        }
        return totalAmount;
    }

    public double getNegativeAmount(){
        double dollarRate = 2.04;
        double euroRate = 2.33;
        double totalAmount = 0;
        for (int i = 0; i < countOfAccount; i++) {
            if(accounts[i].isBlock()) {
                double realBalance = accounts[i].getBalance();
                if (accounts[i].getCurrency().equalsIgnoreCase("dollar")) {
                    realBalance *= dollarRate;
                } else if (accounts[i].getCurrency().equalsIgnoreCase("euro")) {
                    realBalance *= euroRate;
                }
                totalAmount += realBalance;
            }
        }
        return totalAmount;
    }
}
