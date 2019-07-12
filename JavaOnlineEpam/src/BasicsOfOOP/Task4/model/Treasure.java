package BasicsOfOOP.Task4.model;

import BasicsOfOOP.Task4.TypeTreasure;

public class Treasure {
    private TypeTreasure type;
    private String metal;
    private int weight;
    private int priceGram;

    public Treasure(TypeTreasure type, String metal, int weight, int priceGram) {
        this.type = type;
        this.metal = metal;
        this.weight = weight;
        this.priceGram = priceGram;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "type=" + type +
                ", metal='" + metal + '\'' +
                ", weight=" + weight +
                ", priceGram=" + priceGram +
                '}';
    }

    public TypeTreasure getType() {
        return type;
    }

    public void setType(TypeTreasure type) {
        this.type = type;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPriceGram() {
        return priceGram;
    }

    public void setPriceGram(int priceGram) {
        this.priceGram = priceGram;
    }

    public int getValue() {
        return weight * priceGram;
    }
}
