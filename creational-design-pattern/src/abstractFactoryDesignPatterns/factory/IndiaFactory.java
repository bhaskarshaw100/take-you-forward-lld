package abstractFactoryDesignPatterns.factory;

import abstractFactoryDesignPatterns.PaymentGatewayType;
import abstractFactoryDesignPatterns.invoice.Invoice;
import abstractFactoryDesignPatterns.invoice.india.GSTInvoice;
import abstractFactoryDesignPatterns.paymentGateway.PaymentGateway;
import abstractFactoryDesignPatterns.paymentGateway.india.PayUGateway;
import abstractFactoryDesignPatterns.paymentGateway.india.RazorpayGateway;

import static abstractFactoryDesignPatterns.PaymentGatewayType.PAYU;
import static abstractFactoryDesignPatterns.PaymentGatewayType.RAZORPAY;

public class IndiaFactory implements RegionFactory {

    @Override
    public PaymentGateway createPaymentGateway(PaymentGatewayType paymentGatewayType) {
        if (paymentGatewayType == RAZORPAY) {
            return new RazorpayGateway();
        } else if (paymentGatewayType == PAYU) {
            return new PayUGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for India: " + paymentGatewayType);
    }

    @Override
    public Invoice createInvoice() {
        return new GSTInvoice();
    }
}
