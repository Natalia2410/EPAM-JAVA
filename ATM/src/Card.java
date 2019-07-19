public class Card {
    private String cardNumber;
    private String password;
    private double balance;

    public Card(String cardNumber, String password, double balance) {
        this.cardNumber = cardNumber;
        this.password = password;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}
