package ProgrammingWithClasses.Task8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int numberOfCreditCard;
    private int accountNumber;

    public Customer(int id, String surname, String name, String middleName, String address, int numberOfCreditCard, int accountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "id = " + id
                + ", surname = " + surname
                + ", name = " + name
                + ", middleName = " + middleName
                + ", address = " + address
                + ", numberOfCreditCard = " + numberOfCreditCard
                + ", accountNumber = " + accountNumber
                + '}';
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public String getAddress() {
        return address;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
}
