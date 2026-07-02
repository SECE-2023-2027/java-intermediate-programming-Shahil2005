package Problem7;
public abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Appliance is now powered on.");
    }

    public abstract void makeWork();
}
