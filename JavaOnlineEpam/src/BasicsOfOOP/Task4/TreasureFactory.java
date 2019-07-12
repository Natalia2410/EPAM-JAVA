package BasicsOfOOP.Task4;

import BasicsOfOOP.Task4.model.PreciousTreasure;
import BasicsOfOOP.Task4.model.Treasure;

public class TreasureFactory {
    public Treasure createTreasure(TypeTreasure type, String metal, int weight, int priceGram) {
        Treasure treasure = null;
        switch (type) {
            case precious:
                treasure = new PreciousTreasure(type, metal, weight, priceGram);
                break;
            case notprecious:
                treasure = new PreciousTreasure(type, metal, weight, priceGram);
                break;
        }
        return treasure;
    }

    public TypeTreasure getTypeTreasure(String type) {
        TypeTreasure typeTreasure = null;
        switch (type) {
            case "gold":
            case "silver":
            case "platinum":
                typeTreasure = TypeTreasure.precious;
                break;
            case "copper":
            case "aluminum":
                typeTreasure = TypeTreasure.notprecious;
                break;
        }
        return typeTreasure;
    }

    public int getPriceGram(String type) {
        int priceGram = 0;
        switch (type) {
            case "gold":
                priceGram = 90;
                break;
            case "silver":
                priceGram = 70;
                break;
            case "platinum":
                priceGram = 100;
                break;
            case "copper":
                priceGram = 40;
            case "aluminum":
                priceGram = 25;
        }
        return priceGram;
    }
}

