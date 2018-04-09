import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculatorTest {
    private Calculator myCalculator;

    @Before
    public void before(){
        myCalculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(15, myCalculator.add(10, 5));
    }

    @Test
    public void subtract() {
        assertEquals(20, myCalculator.subtract(30, 10));
    }

    @Test
    public void multiply() {
        assertEquals(6, myCalculator.multiply(2, 3));
    }

    @Test
    public void divide() {
        assertEquals(3, myCalculator.divide(21, 7));
    }
}
