import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void getInitalVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void get_volume_after_drink(){
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }

}
