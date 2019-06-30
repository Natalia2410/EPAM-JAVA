package ProgrammingWithClasses.Block2.Task4;

import java.util.Random;

public class Account {
    private int id;
    private double balance;
    private String currency;
    private boolean isBlock;

    public Account(int id, String currency) {
        Random random = new Random();
        int range = 10000;
        this.id = id;
        this.balance = random.nextDouble() * range - range / 2;
        this.currency = currency;
        if (balance < 0) {
            this.isBlock = true;
        } else {
            this.isBlock = false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isBlock() {
        return isBlock;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", isBlock=" + isBlock +
                '}';
    }
}
