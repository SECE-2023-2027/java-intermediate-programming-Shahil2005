package Problem6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter square side length: ");
        int side = scanner.nextInt();

        System.out.println(AreaCalculator.calculateArea(radius));
        System.out.println(AreaCalculator.calculateArea(length, width));
        System.out.println(AreaCalculator.calculateArea(side));

        scanner.close();
    }
}
