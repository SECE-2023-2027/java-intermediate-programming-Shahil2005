package Problem7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter washing machine brand: ");
        String brand = scanner.nextLine();

        Appliance app = new WashingMachine(brand);
        app.turnOn();
        app.makeWork();

        scanner.close();
    }
}
