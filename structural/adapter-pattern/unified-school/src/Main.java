public class Main {
    public static void main(String[] args) {
        // Create adaptees
        AttendanceSystem attendSys = new AttendanceSystem("OpenAttendance");
        GradingSystem gradeSys = new GradingSystem("GradeMaster");
        LibrarySystem libSys = new LibrarySystem("CampusLib");

        // Create adapters
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendSys);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradeSys);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(libSys);

        // Simulate integration
        System.out.println("=== Integrating school systems into the School Management App ===\n");

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();

        System.out.println("=== All systems integrated successfully ===");
    }
}
