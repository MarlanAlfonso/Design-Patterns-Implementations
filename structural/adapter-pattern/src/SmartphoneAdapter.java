public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger charger;

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        System.out.println("[SmartphoneAdapter] Using adapter to plug smartphone charger into outlet...");
        charger.chargePhone();
        System.out.println("[SmartphoneAdapter] Smartphone charger is now plugged into outlet.");
    }
}
