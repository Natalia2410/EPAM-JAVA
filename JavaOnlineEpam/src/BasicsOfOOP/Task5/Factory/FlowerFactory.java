package BasicsOfOOP.Task5.Factory;

import BasicsOfOOP.Task5.Enum.Color;
import BasicsOfOOP.Task5.Enum.FlowerType;
import BasicsOfOOP.Task5.model.*;

public class FlowerFactory {
    public static Flower createFlower(FlowerType type, Color color, int count, int price) {
        Flower flower = null;
        switch (type) {
            case rouse:
                flower = new Rouse(type, color,count, price);
                break;
            case voilet:
                flower = new Violet(type, color,count, price);
                break;
            case tulip:
                flower = new Tulip(type, color,count, price);
                break;
        }
        return flower;
    }

    public FlowerType getFlowerType(String type) {
        FlowerType flowerType = null;
        switch (type) {
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
    public Color getColor(String colorFlow){
        Color color = null;
        switch (colorFlow) {
            case "green":
                color = Color.green;
                break;
            case "red":
                color = Color.red;
                break;
            case "yellow":
                color = Color.yellow;
                break;
        }
        return color;
    }
}
