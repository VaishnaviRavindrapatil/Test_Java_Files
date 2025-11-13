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
    }

    @Test
    void testFactorialOfLargeNumber() {
        assertEquals(3628800, NumberUtil.factorial(10), "Factorial of 10 should be 3628800");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtil.factorial(-5);
        });
        assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
    }
}
