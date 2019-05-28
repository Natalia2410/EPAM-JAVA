import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VegetablesTest {

    @Test
    public void getValue() {
        Root root = new Root(VegetablesType.beet, 200, 50, 70,50);
        int expected = root.getValue();
        int actual = 100;
        Assert.assertEquals(expected, actual);
    }
}