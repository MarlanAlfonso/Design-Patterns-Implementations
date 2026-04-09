public class QueueManager {
    private static QueueManager instance;
    private int currentNumber = 0;

    private QueueManager() {}

    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public int getNextNumber() {
        return ++currentNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void resetNumber(int number) {
        this.currentNumber = number;
        System.out.println("Queue number reset to: " + number);
    }
}
