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
