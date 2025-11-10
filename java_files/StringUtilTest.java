import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    void testToLowerCase_withAllUpperCase() {
        String input = "HELLO WORLD";
        String expected = "hello world";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withMixedCase() {
        String input = "HeLLo WoRLd";
        String expected = "hello world";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withAllLowerCase() {
        String input = "hello world";
        String expected = "hello world";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withNumbersAndSymbols() {
        String input = "1234!@#$%^&*()";
        String expected = "1234!@#$%^&*()";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withNullInput() {
        String input = null;
        String expected = null;
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withWhitespaceOnly() {
        String input = "   ";
        String expected = "   ";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withUnicodeCharacters() {
        String input = "ÄÖÜäöüß";
        String expected = "äöüäöüß";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }

    @Test
    void testToLowerCase_withMixedAlphanumeric() {
        String input = "Java123Programming";
        String expected = "java123programming";
        assertEquals(expected, StringUtil.toLowerCase(input));
    }
}
