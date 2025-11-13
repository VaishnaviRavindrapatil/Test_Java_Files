package StringUtil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testAddExtraCharacterValidInput() {
        // Test with valid inputs
        assertEquals("*hello*", StringUtil.addExtraCharacter("hello", '*'));
        assertEquals("#world#", StringUtil.addExtraCharacter("world", '#'));
        assertEquals("!test!", StringUtil.addExtraCharacter("test", '!'));
    }

    @Test
    void testAddExtraCharacterEmptyString() {
        // Test with an empty string
        assertEquals("*", StringUtil.addExtraCharacter("", '*'));
        assertEquals("#", StringUtil.addExtraCharacter("", '#'));
    }

    @Test
    void testAddExtraCharacterWhitespaceString() {
        // Test with a string containing only whitespace
        assertEquals("* *", StringUtil.addExtraCharacter(" ", '*'));
        assertEquals("#   #", StringUtil.addExtraCharacter("   ", '#'));
    }

    @Test
    void testAddExtraCharacterSpecialCharacters() {
        // Test with special characters in the input string
        assertEquals("*@#$*", StringUtil.addExtraCharacter("@#$", '*'));
        assertEquals("#!@#", StringUtil.addExtraCharacter("!@", '#'));
    }

    @Test
    void testAddExtraCharacterNullInput() {
        // Test with null input string
        assertThrows(IllegalArgumentException.class, () -> StringUtil.addExtraCharacter(null, '*'));
    }

    @Test
    void testAddExtraCharacterNullCharacter() {
        // Test with null character (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> StringUtil.addExtraCharacter("hello", '\0'));
    }

    @Test
    void testAddExtraCharacterNumericCharacter() {
        // Test with numeric character
        assertEquals("1hello1", StringUtil.addExtraCharacter("hello", '1'));
    }

    @Test
    void testAddExtraCharacterUnicodeCharacter() {
        // Test with a Unicode character
        assertEquals("😊hello😊", StringUtil.addExtraCharacter("hello", '😊'));
    }
}
