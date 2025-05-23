import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    public void testEveryStatement(){
        RuntimeException e;

        e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "1234567891011121"));
        assertTrue(e.getMessage().contains("allItems list can't be null!"));

        e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("", 1, 100, 0.0)), "1234567891011121"));
        assertTrue(e.getMessage().contains("Invalid item!"));

        assertEquals(7170.0, SILab2.checkCart(List.of(new Item("Item1", 20, 400, 0.1)), "1234567891011121"));

        e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Item2", 12, 350, 0.8)), "123456789"));
        assertTrue(e.getMessage().contains("Invalid card number!"));

        e = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Item3", 40, 20, 0.0)), "1234567890abcdef"));
        assertTrue(e.getMessage().contains("Invalid character in card number!"));
    }

    public boolean condition(Item item) {
        return (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10);
    }

    @Test
    public void testMultipleCondition(){
        assertTrue(condition(new Item("Item1", 1, 320, 0.1)), "TXX");

        assertTrue(condition(new Item("Item2", 11, 250, 0.2)), "FTX");

        assertTrue(condition(new Item("Item3", 25, 250, 0.0)), "FFT");

        assertFalse(condition(new Item("Item4", 1, 250, 0.0)), "FFF");
    }
}