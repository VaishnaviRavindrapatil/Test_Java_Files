public class StringUtil {

    // Function to reverse a string
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}


public static String toLowerCase(String input) {
    if (input == null) {
        return null;
    }
    return input.toLowerCase();
}


public static String toLowerCase(String input) {
    if (input == null) {
        return null;
    }
    return input.toLowerCase();
}


public static String addExtraCharacter(String input, char extraChar) {
    if (input == null) {
        throw new IllegalArgumentException("Input string cannot be null");
    }
    return extraChar + input + extraChar;
}


public static boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null || str1.length() != str2.length()) {
        return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
}


public static boolean isPalindromic(String str) {
    if (str == null || str.isEmpty()) {
        return false;
    }
    int left = 0, right = str.length() - 1;
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}


public static String toUpperCase(String input) {
    if (input == null) {
        return null;
    }
    return input.toUpperCase();
}
