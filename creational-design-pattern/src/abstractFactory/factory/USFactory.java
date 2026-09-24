package abstractFactory.factory;

import abstractFactory.PaymentGatewayType;
import abstractFactory.invoice.Invoice;
import abstractFactory.invoice.us.USInvoice;
import abstractFactory.paymentGateway.PaymentGateway;
import abstractFactory.paymentGateway.us.PayPalGateway;
import abstractFactory.paymentGateway.us.StripeGateway;

import static abstractFactory.PaymentGatewayType.*;

public class USFactory implements RegionFactory{

    @Override
    public PaymentGateway createPaymentGateway(PaymentGatewayType paymentGatewayType) {
        if (paymentGatewayType == PAYPAL) {
            return new PayPalGateway();
        } else if (paymentGatewayType == STRIPE) {
            return new StripeGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for US: " + paymentGatewayType);
    }

    @Override
    public Invoice createInvoice() {
        return new USInvoice();
    }
}
