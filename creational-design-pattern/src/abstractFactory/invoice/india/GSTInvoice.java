package abstractFactory.invoice.india;

import abstractFactory.invoice.Invoice;

public class GSTInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating GST Invoice for India.");
    }
}
