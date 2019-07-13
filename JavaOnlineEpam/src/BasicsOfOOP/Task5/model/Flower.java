package BasicsOfOOP.Task5.model;

import BasicsOfOOP.Task5.Enum.Color;
import BasicsOfOOP.Task5.Enum.FlowerType;

public abstract class Flower {
    private FlowerType type;
    private Color color;
    private int count;
    private int price;


    public Flower(FlowerType type, Color color, int count, int price) {
        this.type = type;
        this.color = color;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "type=" + type +
                ", color=" + color +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Flower(FlowerType type, Color color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public FlowerType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public int costFlower() {
        return price * count;
    }
}
