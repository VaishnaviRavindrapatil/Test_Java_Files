package Geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateSquareAreaTest {

    @Test
    void testValidSquareArea() {
        // Test with a positive side length
        assertEquals(25, CalculateSquareArea.calculateSquareArea(5));
        assertEquals(0, CalculateSquareArea.calculateSquareArea(0));
        assertEquals(1, CalculateSquareArea.calculateSquareArea(1));
        assertEquals(100, CalculateSquareArea.calculateSquareArea(10));
    }

    @Test
    void testNegativeSideLength() {
        // Test with a negative side length (invalid case)
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculateSquareArea.calculateSquareArea(-5);
        });
        assertEquals("Side length cannot be negative", exception.getMessage());
    }

    @Test
    void testLargeSideLength() {
        // Test with a very large side length
        assertEquals(100000000, CalculateSquareArea.calculateSquareArea(10000));
    }

    @Test
    void testDecimalSideLength() {
        // Test with a decimal side length (invalid case)
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculateSquareArea.calculateSquareArea(5.5);
        });
        assertEquals("Side length must be an integer", exception.getMessage());
    }
}
