public class OnlineMonitoringSystem {
    private QueueManager queueManager;

    public OnlineMonitoringSystem() {
        this.queueManager = QueueManager.getInstance();
    }

    public void displayCurrentNumber() {
        System.out.println("Currently serving number: " + queueManager.getCurrentNumber());
    }
}
