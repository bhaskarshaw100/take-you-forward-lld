package factoryDesignPatterns.logistic;

public class Road implements Logistic {
    @Override
    public void send() {
        System.out.println("Sending by road");
    }
}
