public class Main {
    public static void main(String[] args) {
        HelpDeskStation desk1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation desk2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation desk3 = new HelpDeskStation("Help Desk 3");

        OnlineMonitoringSystem monitor = new OnlineMonitoringSystem();

        desk1.serveNext();
        desk2.serveNext();
        monitor.displayCurrentNumber();

        desk3.resetQueue(100);
        desk1.serveNext();
        monitor.displayCurrentNumber();
    }
}
