package factoryDesignPatterns.logistic;

public class Main {
    public static void main(String[] args) {
        LogisticService logisticService = new LogisticService();
        logisticService.send(LogisticType.AIR);
        logisticService.send(LogisticType.ROAD);
    }
}
