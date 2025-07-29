package abstractFactoryDesignPatterns.paymentGateway.us;

import abstractFactoryDesignPatterns.paymentGateway.PaymentGateway;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing USD payment via PayPal: " + amount);
    }
}
