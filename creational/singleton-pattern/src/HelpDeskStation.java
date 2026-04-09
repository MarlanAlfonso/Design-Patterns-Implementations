public class HelpDeskStation {
    private String stationName;
    private QueueManager queueManager;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
        this.queueManager = QueueManager.getInstance();
    }

    public void serveNext() {
        int number = queueManager.getNextNumber();
        System.out.println(stationName + " serving number: " + number);
    }

    public void resetQueue(int newNumber) {
        queueManager.resetNumber(newNumber);
    }
}
