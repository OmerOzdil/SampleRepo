import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(20, Calculator.add(10, 10));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, Calculator.subtract(10, 10));
    }
}

