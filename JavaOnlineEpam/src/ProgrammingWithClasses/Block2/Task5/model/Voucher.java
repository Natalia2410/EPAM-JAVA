package ProgrammingWithClasses.Block2.Task5.model;

import ProgrammingWithClasses.Block2.Task5.VoucherType;

public class Voucher {
    private VoucherType type;
    private String transport;
    private String diet;
    private int daysQuantity;
    private String country;
    private int price;

    public Voucher(VoucherType type, String country, String transport, String diet, int daysQuantity, int price) {
        this.type = type;
        this.country = country;
        this.transport = transport;
        this.diet = diet;
        this.daysQuantity = daysQuantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "type=" + type +
                ", transport='" + transport + '\'' +
                ", diet='" + diet + '\'' +
                ", daysQuantity=" + daysQuantity +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public VoucherType getType() {
        return type;
    }

    public void setType(VoucherType type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(int daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
