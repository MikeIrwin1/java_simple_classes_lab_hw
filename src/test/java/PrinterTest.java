import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void paperRemaining(){
        assertEquals(20, printer.getPaperRemaining());
    }

    @Test
    public void canPrint(){
        printer.print(3, 2);
        assertEquals(14, printer.getPaperRemaining());
    }
    @Test
    public void cant_print_more_than_paper(){
        printer.print(10, 4);
        assertEquals(20, printer.getPaperRemaining());
    }
    @Test
    public void canRefill(){
        printer.print(1,1);
        printer.refill();
        assertEquals(20, printer.getPaperRemaining());
    }
    @Test
    public void hasToner(){
        assertEquals(100,printer.getToner());
    }

    @Test
    public void consumesToner(){
        printer.print(1,1);
        assertEquals(99,printer.getToner());
    }

    @Test
    public void consumesToner_and_Paper(){
        printer.print(1,10);
        assertEquals(90,printer.getToner());
        assertEquals(10, printer.getPaperRemaining());
    }
}
