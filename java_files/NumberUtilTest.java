import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumberUtilTest {

    @Test
    void testFactorialValidCases() {
        // Test factorial of 0 (edge case)
        assertEquals(1, NumberUtil.factorial(0), "Factorial of 0 should be 1");

        // Test factorial of 1
        assertEquals(1, NumberUtil.factorial(1), "Factorial of 1 should be 1");

        // Test factorial of 5
        assertEquals(120, NumberUtil.factorial(5), "Factorial of 5 should be 120");

        // Test factorial of 10
        assertEquals(3628800, NumberUtil.factorial(10), "Factorial of 10 should be 3628800");
    }

    @Test
    void testFactorialInvalidCases() {
        // Test negative number (invalid input)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtil.factorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage(), "Negative input should throw IllegalArgumentException");

        // Test large number that may cause overflow
        exception = assertThrows(ArithmeticException.class, () -> {
            NumberUtil.factorial(100000);
        });
        assertEquals("Result exceeds maximum value for factorial calculation", exception.getMessage(), "Large input should throw ArithmeticException");
    }
}
