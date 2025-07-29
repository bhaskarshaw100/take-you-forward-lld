package abstractFactoryDesignPatterns.paymentGateway.india;

import abstractFactoryDesignPatterns.paymentGateway.PaymentGateway;

public class PayUGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing INR payment via PayU: " + amount);
    }
}
