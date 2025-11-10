public class StringUtil {

    // Function to reverse a string
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
