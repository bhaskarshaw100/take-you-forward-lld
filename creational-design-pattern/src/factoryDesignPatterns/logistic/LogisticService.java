package factoryDesignPatterns.logistic;

public class LogisticService {
    public void send(LogisticType type) {
        Logistic logistic = LogisticFactory.getLogistic(type);
        logistic.send();
    }
}
