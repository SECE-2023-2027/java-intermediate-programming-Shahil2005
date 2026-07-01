package Problem5;
import java.util.Scanner;

public class Main {
    private static Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("motorcycle".equalsIgnoreCase(type)) {
            return new Motorcycle();
        }
        return new Vehicle();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first vehicle type (car/motorcycle): ");
        Vehicle v1 = createVehicle(scanner.nextLine().trim());
        System.out.print("Enter second vehicle type (car/motorcycle): ");
        Vehicle v2 = createVehicle(scanner.nextLine().trim());

        System.out.println(v1.startEngine());
        System.out.println(v2.startEngine());

        scanner.close();
    }
}
