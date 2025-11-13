public class Geometry {

    // Function to calculate area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}


public static double calculateSquareArea(double sideLength) {
    if (sideLength < 0) {
        throw new IllegalArgumentException("Side length cannot be negative");
    }
    return sideLength * sideLength;
}


public static double calculateRhombusArea(double diagonal1, double diagonal2) {
    if (diagonal1 <= 0 || diagonal2 <= 0) {
        throw new IllegalArgumentException("Diagonals must be positive values.");
    }
    return (diagonal1 * diagonal2) / 2;
}


public static int calculateSquarePerimeter(int sideLength) {
    return 4 * sideLength;
}


public static double calculatePentagonArea(double sideLength) {
    double apothem = sideLength / (2 * Math.tan(Math.PI / 5));
    return (5 * sideLength * apothem) / 2;
}
