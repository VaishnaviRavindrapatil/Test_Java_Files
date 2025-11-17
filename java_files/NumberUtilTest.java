

# ---- Auto-generated tests ----
package com.example.numberutil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumberUtilTest {

    @Test
    void testFahrenheitToCelsius_validCases() {
        // Valid cases
        assertEquals(0.0, NumberUtil.fahrenheitToCelsius(32), 0.001, "32°F should be 0°C");
        assertEquals(100.0, NumberUtil.fahrenheitToCelsius(212), 0.001, "212°F should be 100°C");
        assertEquals(-17.7778, NumberUtil.fahrenheitToCelsius(0), 0.001, "0°F should be -17.7778°C");
        assertEquals(37.7778, NumberUtil.fahrenheitToCelsius(100), 0.001, "100°F should be 37.7778°C");
    }

    @Test
    void testFahrenheitToCelsius_invalidCases() {
        // Invalid cases
        assertThrows(IllegalArgumentException.class, () -> NumberUtil.fahrenheitToCelsius(Double.NaN), "NaN should throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> NumberUtil.fahrenheitToCelsius(Double.POSITIVE_INFINITY), "Positive infinity should throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> NumberUtil.fahrenheitToCelsius(Double.NEGATIVE_INFINITY), "Negative infinity should throw IllegalArgumentException");
    }

    @Test
    void testFahrenheitToCelsius_edgeCases() {
        // Edge cases
        assertEquals(-273.15, NumberUtil.fahrenheitToCelsius(-459.67), 0.001, "-459.67°F should be -273.15°C (absolute zero)");
        assertEquals(-273.149, NumberUtil.fahrenheitToCelsius(-459.66), 0.001, "-459.66°F should be slightly above absolute zero");
    }
}
