public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        System.out.println("[LaptopAdapter] Converting outlet power to laptop-compatible power...");
        laptop.charge();
        System.out.println("[LaptopAdapter] Laptop is now plugged into standard outlet via adapter.");
    }
}
