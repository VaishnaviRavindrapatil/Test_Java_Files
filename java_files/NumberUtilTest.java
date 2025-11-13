package NumberUtil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, NumberUtil.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, NumberUtil.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, NumberUtil.factorial(5), "Factorial of 5 should be 120");
        assertEquals(720, NumberUtil.factorial(6), "Factorial of 6 should be 720");
        assertEquals(5040, NumberUtil.factorial(7), "Factorial of 7 should be 5040");
    }

    @Test
    void testFactorialOfLargeNumber() {
        assertEquals(2432902008176640000L, NumberUtil.factorial(20), "Factorial of 20 should be 2432902008176640000");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtil.factorial(-5);
        });
        assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
    }

    @Test
    void testFactorialOfNonInteger() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtil.factorial(4.5);
        });
        assertEquals("Factorial is only defined for integers", exception.getMessage());
    }
}
