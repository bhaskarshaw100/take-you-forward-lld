package adapterPattern;

public class CheckoutService {
    private PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String orderId, int amount) {
        paymentGateway.pay(orderId, amount);
    }
}
