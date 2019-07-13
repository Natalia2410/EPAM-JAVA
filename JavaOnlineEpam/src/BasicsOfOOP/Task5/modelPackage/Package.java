package BasicsOfOOP.Task5.modelPackage;

import BasicsOfOOP.Task5.Enum.PackageType;

public abstract class Package {
    private PackageType type;
    private int price;

    public Package(PackageType type, int price) {
        this.type = type;
        this.price = price;
    }

    public PackageType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Package{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
