import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testIsAnagram_validAnagrams() {
        assertTrue(StringUtil.isAnagram("listen", "silent"), "Expected 'listen' and 'silent' to be anagrams");
        assertTrue(StringUtil.isAnagram("triangle", "integral"), "Expected 'triangle' and 'integral' to be anagrams");
        assertTrue(StringUtil.isAnagram("evil", "vile"), "Expected 'evil' and 'vile' to be anagrams");
        assertTrue(StringUtil.isAnagram("aabbcc", "ccbbaa"), "Expected 'aabbcc' and 'ccbbaa' to be anagrams");
    }

    @Test
    void testIsAnagram_invalidAnagrams() {
        assertFalse(StringUtil.isAnagram("hello", "world"), "Expected 'hello' and 'world' not to be anagrams");
        assertFalse(StringUtil.isAnagram("test", "tost"), "Expected 'test' and 'tost' not to be anagrams");
        assertFalse(StringUtil.isAnagram("java", "javascript"), "Expected 'java' and 'javascript' not to be anagrams");
        assertFalse(StringUtil.isAnagram("abcd", "abcde"), "Expected 'abcd' and 'abcde' not to be anagrams");
    }

    @Test
    void testIsAnagram_edgeCases() {
        assertTrue(StringUtil.isAnagram("", ""), "Expected two empty strings to be anagrams");
        assertFalse(StringUtil.isAnagram("a", ""), "Expected 'a' and an empty string not to be anagrams");
        assertFalse(StringUtil.isAnagram("", "a"), "Expected an empty string and 'a' not to be anagrams");
        assertTrue(StringUtil.isAnagram("a", "a"), "Expected 'a' and 'a' to be anagrams");
        assertFalse(StringUtil.isAnagram("a", "A"), "Expected 'a' and 'A' not to be anagrams (case-sensitive)");
    }

    @Test
    void testIsAnagram_specialCharacters() {
        assertTrue(StringUtil.isAnagram("a!b@c", "c@b!a"), "Expected 'a!b@c' and 'c@b!a' to be anagrams");
        assertFalse(StringUtil.isAnagram("a!b@c", "abc"), "Expected 'a!b@c' and 'abc' not to be anagrams");
        assertTrue(StringUtil.isAnagram("123", "321"), "Expected '123' and '321' to be anagrams");
        assertFalse(StringUtil.isAnagram("123", "12"), "Expected '123' and '12' not to be anagrams");
    }
}


# ---- Auto-generated tests ----
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testIsPalindromic_withPalindromeString() {
        assertTrue(StringUtil.isPalindromic("madam"), "The string 'madam' should be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withNonPalindromeString() {
        assertFalse(StringUtil.isPalindromic("hello"), "The string 'hello' should not be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withEmptyString() {
        assertTrue(StringUtil.isPalindromic(""), "An empty string should be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withSingleCharacterString() {
        assertTrue(StringUtil.isPalindromic("a"), "A single character string should be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withMixedCasePalindrome() {
        assertTrue(StringUtil.isPalindromic("RaceCar"), "The string 'RaceCar' should be identified as palindromic (case insensitive).");
    }

    @Test
    void testIsPalindromic_withWhitespacePalindrome() {
        assertTrue(StringUtil.isPalindromic("A man a plan a canal Panama"), "The string with spaces 'A man a plan a canal Panama' should be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withSpecialCharacters() {
        assertTrue(StringUtil.isPalindromic("!@#@@#@!"), "The string '!@#@@#@!' should be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withNonPalindromeSpecialCharacters() {
        assertFalse(StringUtil.isPalindromic("!@#abc"), "The string '!@#abc' should not be identified as palindromic.");
    }

    @Test
    void testIsPalindromic_withNullString() {
        assertThrows(NullPointerException.class, () -> StringUtil.isPalindromic(null), "Null input should throw a NullPointerException.");
    }
}


# ---- Auto-generated tests ----
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testToUpperCaseWithValidString() {
        String input = "hello";
        String expected = "HELLO";
        String actual = StringUtil.toUpperCase(input);
        assertEquals(expected, actual, "The string should be converted to uppercase.");
    }

    @Test
    void testToUpperCaseWithEmptyString() {
        String input = "";
        String expected = "";
        String actual = StringUtil.toUpperCase(input);
        assertEquals(expected, actual, "An empty string should remain empty.");
    }

    @Test
    void testToUpperCaseWithMixedCaseString() {
        String input = "HeLLo WoRLd";
        String expected = "HELLO WORLD";
        String actual = StringUtil.toUpperCase(input);
        assertEquals(expected, actual, "The string should be converted to uppercase.");
    }

    @Test
    void testToUpperCaseWithNumbersAndSymbols() {
        String input = "123!@#abc";
        String expected = "123!@#ABC";
        String actual = StringUtil.toUpperCase(input);
        assertEquals(expected, actual, "Numbers and symbols should remain unchanged, but letters should be uppercase.");
    }

    @Test
    void testToUpperCaseWithNullInput() {
        String input = null;
        assertThrows(NullPointerException.class, () -> StringUtil.toUpperCase(input), "Null input should throw NullPointerException.");
    }
}


# ---- Auto-generated tests ----
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testRemoveCapitalCharacters_withAllCapitalLetters() {
        String input = "HELLO";
        String expected = "";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should remove all capital letters");
    }

    @Test
    void testRemoveCapitalCharacters_withMixedCaseLetters() {
        String input = "HelloWorld";
        String expected = "elloorld";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should remove only capital letters");
    }

    @Test
    void testRemoveCapitalCharacters_withNoCapitalLetters() {
        String input = "hello";
        String expected = "hello";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should return the original string if no capital letters are present");
    }

    @Test
    void testRemoveCapitalCharacters_withEmptyString() {
        String input = "";
        String expected = "";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should return an empty string when input is empty");
    }

    @Test
    void testRemoveCapitalCharacters_withSpecialCharacters() {
        String input = "Hello@World!";
        String expected = "ello@orld!";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should remove only capital letters and leave special characters untouched");
    }

    @Test
    void testRemoveCapitalCharacters_withNumbersAndCapitalLetters() {
        String input = "123ABC456";
        String expected = "123456";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should remove capital letters and leave numbers untouched");
    }

    @Test
    void testRemoveCapitalCharacters_withWhitespaceAndCapitalLetters() {
        String input = "A B C";
        String expected = " ";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should remove capital letters and leave whitespace untouched");
    }

    @Test
    void testRemoveCapitalCharacters_withNullInput() {
        String input = null;
        assertThrows(NullPointerException.class, () -> StringUtil.removeCapitalCharacters(input), "Should throw NullPointerException for null input");
    }

    @Test
    void testRemoveCapitalCharacters_withUnicodeCapitalLetters() {
        String input = "ПриветМир";
        String expected = "риветир";
        String actual = StringUtil.removeCapitalCharacters(input);
        assertEquals(expected, actual, "Should remove capital letters including Unicode characters");
    }
}
