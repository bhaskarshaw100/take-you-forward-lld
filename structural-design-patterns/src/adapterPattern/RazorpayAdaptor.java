package adapterPattern;

public class RazorpayAdaptor implements PaymentGateway {

    private final RazorpayAPI razorpayAPI;

    public RazorpayAdaptor() {
        razorpayAPI = new RazorpayAPI();
    }

    @Override
    public void pay(String orderId, int amount) {
        razorpayAPI.makePayment(orderId, amount);
    }
}
