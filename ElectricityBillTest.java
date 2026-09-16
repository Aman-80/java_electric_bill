import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ElectricityBillTest {

    @Test
    void testBillFor100Units() {
        assertEquals(150.0,
                ElectricityBill.calculateBill(100));
    }

    @Test
    void testBillFor200Units() {
        assertEquals(400.0,
                ElectricityBill.calculateBill(200));
    }

    @Test
    void testBillFor300Units() {
        assertEquals(800.0,
                ElectricityBill.calculateBill(300));
    }
}
