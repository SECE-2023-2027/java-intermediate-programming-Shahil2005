package Problem8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter rectangle height: ");
        double height = scanner.nextDouble();

        Shape s1 = new Circle(radius);
        Shape s2 = new Rectangle(width, height);

        System.out.println(Math.round(s1.getArea()));
        System.out.println(s2.getArea());

        scanner.close();
    }
}
