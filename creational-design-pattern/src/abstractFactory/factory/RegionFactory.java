package abstractFactory.factory;

import abstractFactory.PaymentGatewayType;
import abstractFactory.invoice.Invoice;
import abstractFactory.paymentGateway.PaymentGateway;

public interface RegionFactory {
    PaymentGateway createPaymentGateway(PaymentGatewayType gatewayType);
    Invoice createInvoice();
}
