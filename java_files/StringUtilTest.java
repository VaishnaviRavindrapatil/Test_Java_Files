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
