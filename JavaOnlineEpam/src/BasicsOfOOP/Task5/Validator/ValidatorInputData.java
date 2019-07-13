package BasicsOfOOP.Task5.Validator;

import BasicsOfOOP.Task5.Enum.FlowerType;
import BasicsOfOOP.Task5.Enum.PackageType;
import BasicsOfOOP.Task5.Enum.Color;


public class ValidatorInputData {
    public FlowerType getFlowerTypeForClient(String type) {
        FlowerType flowerType = null;
        switch (type.toLowerCase()) {
            case "rouse":
                flowerType = FlowerType.rouse;
                break;
            case "voilet":
                flowerType = FlowerType.voilet;
                break;
            case "tulip":
                flowerType = FlowerType.tulip;
                break;
        }
        return flowerType;
    }

    public Color getColortForClient(String color) {
        Color colorForClient = null;
        switch (color.toLowerCase()) {
            case "red":
                colorForClient = Color.red;
                break;
            case "green":
                colorForClient = Color.green;
                break;
            case "yellow":
                colorForClient = Color.yellow;
                break;
        }
        return colorForClient;
    }

    public int getCountFlowersForClient(String count) {
        int countFlowersForClient = 0;
        if (count.matches("\\d+")) {
            countFlowersForClient = Integer.parseInt(count);
        }
        return countFlowersForClient;
    }

    public PackageType getPackage(String type){
        PackageType packageForClient = null;
        switch (type) {
            case "box":
                packageForClient = PackageType.box;
                break;
            case "paper":
                packageForClient = PackageType.paper;
                break;
            case "film":
                packageForClient = PackageType.film;
                break;
        }
        return packageForClient;
    }
}
