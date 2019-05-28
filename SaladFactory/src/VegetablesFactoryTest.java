import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class VegetablesFactoryTest {
    @Test
    public void getVegetables() throws IOException {
        Vegetables expected = VegetablesFactory.getVegetables(VegetablesType.carrot);
        Vegetables actual = new Root(VegetablesType.carrot, 300, 30, 60,60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getVegetablesType() {
        VegetablesType expected = Main.vegetablesFactory.getVegetablesType("dill");
        VegetablesType actual = VegetablesType.dill;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeight() throws IOException {
        int expected = VegetablesFactory.getWeight(VegetablesType.carrot);
        int actual = 300;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCaloriesByType() {
        int expected = VegetablesFactory.getCaloriesByType(VegetablesType.turnip);
        int actual = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getVitaminC() {
        int expected = VegetablesFactory.getVitaminC(VegetablesType.spinach);
        int actual = 350;
        Assert.assertEquals(expected, actual);
    }
}