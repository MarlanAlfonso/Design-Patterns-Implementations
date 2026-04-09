public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void plugIn() {
        System.out.println("[RefrigeratorAdapter] Ensuring outlet supplies required current for refrigerator...");
        refrigerator.startCooling();
        System.out.println("[RefrigeratorAdapter] Refrigerator is now running via standard outlet.");
    }
}
