package BasicsOfOOP.Task5.Factory;

import BasicsOfOOP.Task5.Enum.PackageType;
import BasicsOfOOP.Task5.modelPackage.Package;
import BasicsOfOOP.Task5.modelPackage.Box;
import BasicsOfOOP.Task5.modelPackage.Film;
import BasicsOfOOP.Task5.modelPackage.Paper;

public class PackageFactory {
    public Package createPackage(PackageType type, int price) {
        Package pacKage = null;
        switch (type) {
            case box:
                pacKage = new Box(type, price);
                break;
            case film:
                pacKage = new Film(type, price);
                break;
            case paper:
                pacKage = new Paper(type, price);
                break;
        }
        return pacKage;
    }

    public PackageType getPackageType(String type) {
        PackageType packageType = null;
        switch (type) {
            case "box":
                packageType = PackageType.box;
                break;
            case "film":
                packageType = PackageType.film;
                break;
            case "paper":
                packageType = PackageType.paper;
                break;
        }
        return packageType;
    }

    public int getPriceOfPackage(PackageType type){
        int price = 0;
        switch (type) {
            case box:
                price = 200;
                break;
            case film:
                price = 100;
                break;
            case paper:
                price = 50;
                break;
        }
        return price;
    }
}
