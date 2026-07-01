import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter employee base salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter manager name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Enter manager base salary: ");
        double mgrSalary = scanner.nextDouble();
        System.out.print("Enter manager bonus: ");
        double mgrBonus = scanner.nextDouble();

        Employee emp = new Employee(empName, empSalary);
        Manager mgr = new Manager(mgrName, mgrSalary, mgrBonus);

        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());

        scanner.close();
    }
}