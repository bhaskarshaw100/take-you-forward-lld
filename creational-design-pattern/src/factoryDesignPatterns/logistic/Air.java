package factoryDesignPatterns.logistic;

public class Air implements Logistic{
    @Override
    public void send() {
        System.out.println("Sending by air");
    }
}
