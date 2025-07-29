package abstractFactoryDesignPatterns.factory;

import abstractFactoryDesignPatterns.PaymentGatewayType;
import abstractFactoryDesignPatterns.invoice.Invoice;
import abstractFactoryDesignPatterns.invoice.us.USInvoice;
import abstractFactoryDesignPatterns.paymentGateway.PaymentGateway;
import abstractFactoryDesignPatterns.paymentGateway.us.PayPalGateway;
import abstractFactoryDesignPatterns.paymentGateway.us.StripeGateway;

import static abstractFactoryDesignPatterns.PaymentGatewayType.*;

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
