public class Laptop {
    private String model;

    public Laptop(String model) {
        this.model = model;
    }

    public void charge() {
        System.out.println("Laptop " + model + ": Charging via laptop power port...");
        System.out.println("Laptop " + model + ": Charging started (AC -> DC conversion).");
    }
}