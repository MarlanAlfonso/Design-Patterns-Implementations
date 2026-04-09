public class AttendanceSystem {
    private String systemName;

    public AttendanceSystem(String systemName) {
        this.systemName = systemName;
    }

    public void markAttendance() {
        System.out.println("[" + systemName + "] Marking attendance for students...");
        System.out.println("[" + systemName + "] Attendance marked successfully.");
    }
}