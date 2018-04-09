import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class waterBottleTest {

    private waterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new waterBottle(100);
    }

    @Test
    public void hasWater() {
        assertEquals(100, myWaterBottle.hasWater());
    }

    @Test
    public void drink() {
        myWaterBottle.drink();
        assertEquals(90, myWaterBottle.hasWater());
    }

    @Test
    public void empty(){
        myWaterBottle.empty();
        assertEquals(0, myWaterBottle.hasWater());
    }

    @Test
    public void fill(){
        myWaterBottle.fill();
        assertEquals(100, myWaterBottle.hasWater());
    }

}