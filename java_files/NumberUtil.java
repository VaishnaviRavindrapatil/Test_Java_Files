public class NumberUtil {

    // Function to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


public static int factorial(int number) {
    if (number < 0) {
        throw new IllegalArgumentException("Number must be non-negative.");
    }
    int result = 1;
    for (int i = 1; i <= number; i++) {
        result *= i;
    }
    return result;
}


public static int factorial(int number) {
    if (number < 0) {
        throw new IllegalArgumentException("Number must be non-negative");
    }
    int result = 1;
    for (int i = 1; i <= number; i++) {
        result *= i;
    }
    return result;
}


public static int factorial(int number) {
    if (number < 0) {
        throw new IllegalArgumentException("Number must be non-negative.");
    }
    int result = 1;
    for (int i = 1; i <= number; i++) {
        result *= i;
    }
    return result;
}
