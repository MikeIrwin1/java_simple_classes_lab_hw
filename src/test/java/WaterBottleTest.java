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

    @Test
    public void can_the_bottle_empty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void cannot_drink_beyond_0(){
        waterBottle.empty();
        waterBottle.takeDrink();
        assertEquals(0, waterBottle.getVolume());
    }

}
