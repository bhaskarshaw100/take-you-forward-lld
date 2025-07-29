package abstractFactoryDesignPatterns.factory;

import abstractFactoryDesignPatterns.PaymentGatewayType;
import abstractFactoryDesignPatterns.invoice.Invoice;
import abstractFactoryDesignPatterns.paymentGateway.PaymentGateway;

public interface RegionFactory {
    PaymentGateway createPaymentGateway(PaymentGatewayType gatewayType);
    Invoice createInvoice();
}
