```java
package Geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculateRhombusAreaTest {

    @Test
    void testValidAreaCalculation() {
        // Valid case: diagonals are positive
        double diagonal1 = 10.0;
        double diagonal2 = 8.0;
        double expectedArea = 40.0; // (10 * 8) / 2
        assertEquals(expectedArea, calculateRhombusArea(diagonal1, diagonal2), 0.0001);
    }

    @Test
    void testZeroDiagonals() {
        // Invalid case: one or both diagonals are zero
        double diagonal1 = 0.0;
        double diagonal2 = 8.0;
        assertThrows(IllegalArgumentException.class, () -> calculateRhombusArea(diagonal1, diagonal2));

        diagonal1 = 10.0;
        diagonal2 = 0.0;
        assertThrows(IllegalArgumentException.class, () -> calculateRhombusArea(diagonal1, diagonal2));

        diagonal1 = 0.0;
        diagonal2 = 0.0;
        assertThrows(IllegalArgumentException.class, () -> calculateRhombusArea(diagonal1, diagonal2));
    }

    @Test
    void testNegativeDiagonals() {
        // Invalid case: one or both diagonals are negative
        double diagonal1 = -10.0;
        double diagonal2 = 8.0;
        assertThrows(IllegalArgumentException.class, () -> calculateRhombusArea(diagonal1, diagonal2));

        diagonal1 = 10.0;
        diagonal2 = -8.0;
        assertThrows(IllegalArgumentException.class, () -> calculateRhombusArea(diagonal1, diagonal2));

        diagonal1 = -10.0;
        diagonal2 = -8.0;
        assertThrows(IllegalArgumentException.class, () -> calculateRhombusArea(diagonal1, diagonal2));
    }

    @Test
    void testLargeDiagonals() {
        // Valid case: very large diagonals
        double diagonal1 = 1e6;
        double diagonal2 = 2e6;
        double expectedArea = 1e12; // (1e6 * 2e6) / 2
        assertEquals(expectedArea, calculateRhombusArea(diagonal1, diagonal2), 0.0001);
    }

    @Test
    void testSmallDiagonals() {
        // Valid case: very small diagonals
        double diagonal1 = 0.0001;
        double diagonal2 = 0.0002;
        double expectedArea = 0.00000001; // (0.0001 * 0.0002) / 2
        assertEquals(expectedArea, calculateRhombusArea(diagonal1, diagonal2), 1e-12);
    }

    // Mock of the calculateRhombusArea function for testing purposes
    private double calculateRhombusArea(double diagonal1, double diagonal2) {
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            throw new IllegalArgumentException("Diagonals must be positive numbers.");
        }
        return (diagonal1 * diagonal2) / 2;
    }
