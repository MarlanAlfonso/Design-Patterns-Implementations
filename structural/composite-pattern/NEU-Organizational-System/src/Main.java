public class Main {
    public static void main(String[] args) {

        // Create College
        College engineering = new College("College of Engineering");

        // Create Departments
        Department cs = new Department("Computer Science");
        Department it = new Department("Information Technology");

        // Create Teachers
        Teacher t1 = new Teacher("Mr. Santos", "Programming", 50000);
        Teacher t2 = new Teacher("Ms. Cruz", "Networking", 45000);

        // Create Students
        Student s1 = new Student("Juan", "2023001", 20000);
        Student s2 = new Student("Maria", "2023002", 20000);
        Student s3 = new Student("Pedro", "2023003", 18000);

        // Build structure
        cs.add(t1);
        cs.add(s1);
        cs.add(s2);

        it.add(t2);
        it.add(s3);

        engineering.add(cs);
        engineering.add(it);

        // Display
        System.out.println("===== STRUCTURE =====");
        engineering.displayDetails("");

        // Student count
        System.out.println("\nTotal Students: " + engineering.getStudentCount());

        // Budget
        System.out.println("Total Budget: " + engineering.getBudget());
    }
}