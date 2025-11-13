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
