public class Refrigerator {
    private String brand;

    public Refrigerator(String brand) {
        this.brand = brand;
    }

    public void startCooling() {
        System.out.println("Refrigerator " + brand + ": Power detected. Starting cooling cycle...");
        System.out.println("Refrigerator " + brand + ": Compressor running.");
    }
}
