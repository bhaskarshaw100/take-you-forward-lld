package abstractFactoryDesignPatterns;

import abstractFactoryDesignPatterns.factory.IndiaFactory;
import abstractFactoryDesignPatterns.factory.USFactory;
import abstractFactoryDesignPatterns.service.CheckoutService;

public class Main {
    public static void main(String[] args) {
        // Using Razorpay in India
        CheckoutService indiaCheckout = new CheckoutService(new IndiaFactory(), PaymentGatewayType.RAZORPAY);
        indiaCheckout.completeOrder(1999.0);

        System.out.println("---");

        // Using PayPal in US
        CheckoutService usCheckout = new CheckoutService(new USFactory(), PaymentGatewayType.PAYPAL);
        usCheckout.completeOrder(49.99);
    }
}
