public class Main {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("ThinkPad-X1");
        Refrigerator myFridge = new Refrigerator("LG-360");
        SmartphoneCharger myCharger = new SmartphoneCharger("USB-C");

        PowerOutlet laptopOutlet = new LaptopAdapter(myLaptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(myFridge);
        PowerOutlet phoneOutlet  = new SmartphoneAdapter(myCharger);

        System.out.println("=== Plugging devices into standard power outlet ===\n");

        laptopOutlet.plugIn();
        System.out.println();

        fridgeOutlet.plugIn();
        System.out.println();

        phoneOutlet.plugIn();
        System.out.println();

        System.out.println("=== All devices plugged in via adapters ===");
    }
}
