package adapterPattern;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new RazorpayAdaptor());
        checkoutService.checkout("1234", 1700);
    }
}
