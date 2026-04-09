public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        System.out.println("[AttendanceSystemAdapter] Integrating attendance system...");
        attendanceSystem.markAttendance();
        System.out.println("[AttendanceSystemAdapter] Attendance system integrated.\n");
    }
}