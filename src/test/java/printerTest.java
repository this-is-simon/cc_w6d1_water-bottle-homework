import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class printerTest {

    private Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(50, 100);
    }

    @Test
    public void returnPaperLevel() {
        assertEquals(50, myPrinter.returnPaperLevel());
    };

    @Test
    public void print() {
        myPrinter.print(5, 2);
        assertEquals(40, myPrinter.returnPaperLevel());
    }

    @Test
    public void printTooManyPrinterDoesntRun() {
        myPrinter.print(100, 2);
        assertEquals(50, myPrinter.returnPaperLevel());
    }

    @Test
    public void canRefillPaper() {
        myPrinter.print(5, 10);
        assertEquals(0, myPrinter.returnPaperLevel());
        myPrinter.refillPaper(50);
        assertEquals(50, myPrinter.returnPaperLevel());
    };

    @Test
    public void returnTonerLevel() {
      assertEquals(100, myPrinter.returnTonerLevel());
    };

    @Test
    public void canReduceToner() {
        myPrinter.print(5, 2);
        assertEquals(90, myPrinter.returnTonerLevel());
    }

}
