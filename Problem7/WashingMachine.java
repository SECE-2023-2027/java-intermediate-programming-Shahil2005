package Problem7;
public class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void makeWork() {
        System.out.println("Washing machine is washing clothes.");
    }
}
