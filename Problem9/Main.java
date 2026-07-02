package Problem9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter action (print/scan): ");
        String action = scanner.nextLine().trim().toLowerCase();
        AllInOneDevice device = new AllInOneDevice();

        if ("print".equals(action)) {
            device.printData();
        } else if ("scan".equals(action)) {
            device.scanData();
        } else {
            System.out.println("Unknown action. Running both operations.");
            device.printData();
            device.scanData();
        }

        scanner.close();
    }
}
