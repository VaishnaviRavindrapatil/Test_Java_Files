import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    void testToLowerCaseWithUppercaseString() {
        String input = "HELLO WORLD";
        String expected = "hello world";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "The string should be converted to lowercase.");
    }

    @Test
    void testToLowerCaseWithMixedCaseString() {
        String input = "HeLLo WoRLd";
        String expected = "hello world";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "The string should be converted to lowercase.");
    }

    @Test
    void testToLowerCaseWithLowercaseString() {
        String input = "hello world";
        String expected = "hello world";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "The string should remain unchanged.");
    }

    @Test
    void testToLowerCaseWithEmptyString() {
        String input = "";
        String expected = "";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "An empty string should remain unchanged.");
    }

    @Test
    void testToLowerCaseWithNumbersAndSymbols() {
        String input = "12345!@#$%";
        String expected = "12345!@#$%";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "Numbers and symbols should remain unchanged.");
    }

    @Test
    void testToLowerCaseWithNullInput() {
        String input = null;
        assertThrows(NullPointerException.class, () -> {
            StringUtil.toLowerCase(input);
        }, "Null input should throw NullPointerException.");
    }

    @Test
    void testToLowerCaseWithWhitespaceOnly() {
        String input = "   ";
        String expected = "   ";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "Whitespace-only strings should remain unchanged.");
    }

    @Test
    void testToLowerCaseWithUnicodeCharacters() {
        String input = "ÄÖÜß";
        String expected = "äöüß";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "Unicode characters should be converted to lowercase.");
    }

    @Test
    void testToLowerCaseWithSpecialCharacters() {
        String input = "Hello@World!";
        String expected = "hello@world!";
        String actual = StringUtil.toLowerCase(input);
        assertEquals(expected, actual, "Special characters should remain unchanged while letters are converted to lowercase.");
    }
}
