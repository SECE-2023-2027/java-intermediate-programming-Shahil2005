package Problem9;
public class AllInOneDevice implements Printer, Scanner {
    @Override
    public void printData() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanData() {
        System.out.println("Scanning document...");
    }
}
