package Geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatePentagonAreaTest {

    @Test
    void testValidPentagonArea() {
        // Valid case: side length is positive
        double sideLength = 5.0;
        double expectedArea = 43.01193501472417; // Pre-calculated expected value
        assertEquals(expectedArea, CalculatePentagonArea.calculatePentagonArea(sideLength), 0.0001);
    }

    @Test
    void testZeroSideLength() {
        // Edge case: side length is zero
        double sideLength = 0.0;
        double expectedArea = 0.0;
        assertEquals(expectedArea, CalculatePentagonArea.calculatePentagonArea(sideLength), 0.0001);
    }

    @Test
    void testNegativeSideLength() {
        // Invalid case: side length is negative
        double sideLength = -5.0;
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatePentagonArea.calculatePentagonArea(sideLength);
        });
    }

    @Test
    void testSmallSideLength() {
        // Valid case: very small side length
        double sideLength = 0.0001;
        double expectedArea = 4.330127018922193E-8; // Pre-calculated expected value
        assertEquals(expectedArea, CalculatePentagonArea.calculatePentagonArea(sideLength), 0.0001);
    }

    @Test
    void testLargeSideLength() {
        // Valid case: very large side length
        double sideLength = 1000.0;
        double expectedArea = 4.330127018922193E6; // Pre-calculated expected value
        assertEquals(expectedArea, CalculatePentagonArea.calculatePentagonArea(sideLength), 0.0001);
    }
}
