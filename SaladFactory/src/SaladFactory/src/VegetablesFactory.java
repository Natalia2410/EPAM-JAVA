import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VegetablesFactory {

    public static Vegetables getVegetables(VegetablesType type) throws IOException {

        Vegetables vegetable = null;
        switch (type) {
            case beet:
            case carrot:
            case turnip:
                vegetable = new Root(type, getWeight(type), getCaloriesByType(type), getVitaminC(type),getSugar(type));
                break;
            case onion:
            case garlic:
                vegetable = new Bulbous(type, getWeight(type), getCaloriesByType(type), getVitaminC(type));
                break;
            case dill:
            case parsley:
            case lettuce:
            case spinach:
                vegetable = new Sheet(type, getWeight(type), getCaloriesByType(type), getVitaminC(type));
                break;
            case potato:
                vegetable = new Tuber(type, getWeight(type), getCaloriesByType(type), getVitaminC(type),getStarch(type));
                break;
            default:
                throw new IllegalArgumentException("wrong vegetable type: " + type);
        }
        return vegetable;
    }

    public VegetablesType getVegetablesType(String type) {
        VegetablesType vegetablesType = null;

        switch (type) {
            case "beet":
                vegetablesType = VegetablesType.beet;
                break;
            case "onion":
                vegetablesType = VegetablesType.onion;
                break;
            case "dill":
                vegetablesType = VegetablesType.dill;
                break;
            case "carrot":
                vegetablesType = VegetablesType.carrot;
                break;
            case "garlic":
                vegetablesType = VegetablesType.garlic;
                break;
            case "parsley":
                vegetablesType = VegetablesType.parsley;
                break;
            case "potato":
                vegetablesType = VegetablesType.potato;
                break;
            case "turnip":
                vegetablesType = VegetablesType.turnip;
                break;
            case "lettuce":
                vegetablesType = VegetablesType.lettuce;
                break;
            case "spinach":
                vegetablesType = VegetablesType.spinach;
                break;
            default:
                throw new IllegalArgumentException("Wrong vegetable type:" + type);
        }
        return vegetablesType;
    }

    public static int getWeight(VegetablesType type) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("ingridients"));
        String line;
        String[] words;
        int weight = 0;
        while ((line = reader.readLine()) != null) {
            if (line.contains(String.valueOf(type))) {
                words = line.split("\\s");
                weight = Integer.parseInt(words[1]);
            }
        }
        return weight;
    }

    public static int getCaloriesByType(VegetablesType type) {
        int calories = 0;
        switch (type) {
            case garlic:
                calories = 10;
                break;
            case onion:
                calories = 20;
                break;
            case carrot:
                calories = 30;
                break;
            case potato:
                calories = 30;
                break;
            case beet:
                calories = 50;
                break;
            case turnip:
                calories = 30;
                break;
            case lettuce:
                calories = 30;
                break;
            case spinach:
                calories = 80;
                break;
            case dill:
                calories = 90;
                break;
            case parsley:
                calories = 100;
                break;
        }
        return calories;
    }

    public static int getVitaminC(VegetablesType type) {
        int vitaminC = 0;
        switch (type) {
            case parsley:
                vitaminC = 200;
                break;
            case lettuce:
                vitaminC = 300;
                break;
            case dill:
                vitaminC = 250;
                break;
            case spinach:
                vitaminC = 350;
                break;
            case onion:
                vitaminC = 50;
                break;
            case turnip:
                vitaminC = 15;
                break;
            case beet:
                vitaminC = 70;
                break;
            case garlic:
                vitaminC = 15;
                break;
            case carrot:
                vitaminC = 60;
                break;
            case potato:
                vitaminC = 5;
                break;
        }
        return vitaminC;
    }

    public static int getSugar(VegetablesType type) {
        int sugar = 0;
        switch (type) {
            case turnip:
                sugar = 15;
                break;
            case beet:
                sugar = 70;
                break;
            case carrot:
                sugar = 60;
                break;
        }
        return sugar;
    }

    public static int getStarch(VegetablesType type) {
        int starch = 0;
        switch (type) {
            case potato:
                starch = 15;
                break;
        }
        return starch;
    }
}