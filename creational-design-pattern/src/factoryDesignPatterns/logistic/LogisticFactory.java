package factoryDesignPatterns.logistic;

public class LogisticFactory {
    public static Logistic getLogistic(LogisticType type) {
        return switch (type) {
            case AIR -> new Air();
            case ROAD -> new Road();
        };
    }
}
