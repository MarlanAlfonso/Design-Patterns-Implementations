public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        System.out.println("[GradingSystemAdapter] Integrating grading system...");
        gradingSystem.recordGrades();
        System.out.println("[GradingSystemAdapter] Grading system integrated.\n");
    }
}
