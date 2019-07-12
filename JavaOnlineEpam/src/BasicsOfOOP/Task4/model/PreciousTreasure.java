package BasicsOfOOP.Task4.model;

import BasicsOfOOP.Task4.TypeTreasure;
import BasicsOfOOP.Task4.model.Treasure;

public class PreciousTreasure extends Treasure {
    public PreciousTreasure(TypeTreasure type, String metal, int weight, int priceGram) {
        super(type, metal, weight, priceGram);
    }
}
