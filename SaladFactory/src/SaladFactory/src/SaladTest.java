import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import static org.junit.Assert.*;

public class SaladTest {

    @Test
    public void getValueAll() {

        Root carrot = new Root(VegetablesType.carrot, 300, 30, 20,50);
        Bulbous garlic = new Bulbous(VegetablesType.garlic, 50, 10, 10);
        Sheet lettuce = new Sheet(VegetablesType.lettuce, 400, 70, 10);

        ArrayList<Vegetables> salad = new ArrayList<>();
        salad.add(carrot);
        salad.add(garlic);
        salad.add(lettuce);

        Salad saladSummer = new Salad("Summer", salad);

        int expected = saladSummer.getValueAll();
        int actual = 375;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getListIngridientsInRange() {

        Root carrot = new Root(VegetablesType.carrot, 300, 30, 20,50);
        Bulbous garlic = new Bulbous(VegetablesType.garlic, 50, 10, 10);
        Sheet lettuce = new Sheet(VegetablesType.lettuce, 400, 70, 10);

        ArrayList<Vegetables> list = new ArrayList<>();
        list.add(carrot);
        list.add(garlic);
        list.add(lettuce);

        Salad saladWinter = new Salad("Summer", list);

        ArrayList<Vegetables> expected = saladWinter.getListIngridientsInRange(10, 35);

        ArrayList<Vegetables> actual = new ArrayList<>();
        actual.add(carrot);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sort() {

        Root carrot = new Root(VegetablesType.carrot, 300, 30, 20,50);
        Bulbous garlic = new Bulbous(VegetablesType.garlic, 50, 70, 20);
        Sheet lettuce = new Sheet(VegetablesType.lettuce, 400, 70, 25);
        Tuber potato = new Tuber(VegetablesType.potato, 350, 20, 5,100);

        ArrayList<Vegetables> list = new ArrayList<>();
        list.add(carrot);
        list.add(garlic);
        list.add(lettuce);
        list.add(potato);

        ArrayList<Vegetables> actual = new ArrayList<>();
        actual.add(potato);
        actual.add(carrot);
        actual.add(lettuce);
        actual.add(garlic);

        Salad saladSpring = new Salad("Spring", list);
        saladSpring.sort();
        ArrayList<Vegetables> expected = saladSpring.ingridients;

        Assert.assertEquals(expected, actual);
    }
}