package adapterPattern;

public class PayUGateway implements PaymentGateway {

    @Override
    public void pay(String orderId, int amount) {
        System.out.println("Paid Rs." + amount + " using PayU for order: " + orderId);
    }
}
