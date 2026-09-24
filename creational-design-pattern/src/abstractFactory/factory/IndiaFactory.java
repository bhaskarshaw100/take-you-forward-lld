package abstractFactory.factory;

import abstractFactory.PaymentGatewayType;
import abstractFactory.invoice.Invoice;
import abstractFactory.invoice.india.GSTInvoice;
import abstractFactory.paymentGateway.PaymentGateway;
import abstractFactory.paymentGateway.india.PayUGateway;
import abstractFactory.paymentGateway.india.RazorpayGateway;

import static abstractFactory.PaymentGatewayType.PAYU;
import static abstractFactory.PaymentGatewayType.RAZORPAY;

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
