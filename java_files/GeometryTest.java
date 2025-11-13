package Geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculateSquarePerimeterTest {

    @Test
    void testValidPerimeterCalculation() {
        // Valid cases
        assertEquals(16, calculateSquarePerimeter(4));
        assertEquals(40, calculateSquarePerimeter(10));
        assertEquals(0, calculateSquarePerimeter(0));
    }

    @Test
    void testNegativeSideLength() {
        // Invalid case: negative side length
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculateSquarePerimeter(-5);
        });
        assertEquals("Side length cannot be negative", exception.getMessage());
    }

    @Test
    void testLargeSideLength() {
        // Valid case: large side length
        assertEquals(4000000, calculateSquarePerimeter(1000000));
    }

    @Test
    void testDecimalSideLength() {
        // Valid case: decimal side length
        assertEquals(10.4, calculateSquarePerimeter(2.6), 0.0001);
    }

    @Test
    void testEdgeCaseSideLength() {
        // Edge case: very small side length
        assertEquals(0.0004, calculateSquarePerimeter(0.0001), 0.0001);
    }

    // Mock implementation of the function for testing purposes
    private double calculateSquarePerimeter(double sideLength) {
        if (sideLength < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return 4 * sideLength;
    }
}
