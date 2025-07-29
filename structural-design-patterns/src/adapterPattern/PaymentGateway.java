package adapterPattern;

public interface PaymentGateway {
    void pay(String orderId, int amount);
}
