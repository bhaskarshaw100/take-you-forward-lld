package abstractFactoryDesignPatterns.service;

import abstractFactoryDesignPatterns.PaymentGatewayType;
import abstractFactoryDesignPatterns.factory.RegionFactory;
import abstractFactoryDesignPatterns.invoice.Invoice;
import abstractFactoryDesignPatterns.paymentGateway.PaymentGateway;

public class CheckoutService {
    private PaymentGateway paymentGateway;
    private Invoice invoice;
    private PaymentGatewayType paymentGatewayType;

    public CheckoutService(RegionFactory regionFactory, PaymentGatewayType paymentGatewayType) {
        this.paymentGatewayType = paymentGatewayType;
        this.paymentGateway = regionFactory.createPaymentGateway(paymentGatewayType);
        this.invoice = regionFactory.createInvoice();
    }

    public void completeOrder(double amount) {
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
