public class GradingSystem {
    private String provider;

    public GradingSystem(String provider) {
        this.provider = provider;
    }

    public void recordGrades() {
        System.out.println("[" + provider + " GradingSystem] Recording student grades...");
        System.out.println("[" + provider + " GradingSystem] Grades recorded.");
    }
}
