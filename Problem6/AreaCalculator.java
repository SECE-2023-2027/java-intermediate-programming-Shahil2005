package Problem6;
public class AreaCalculator {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(int side) {
        return (double) side * side;
    }
}
