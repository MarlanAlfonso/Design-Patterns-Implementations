public class SmartphoneCharger {
    private String type;

    public SmartphoneCharger(String type) {
        this.type = type;
    }

    public void chargePhone() {
        System.out.println("SmartphoneCharger (" + type + "): Providing 5V USB power to phone...");
        System.out.println("SmartphoneCharger (" + type + "): Phone charging.");
    }
}
