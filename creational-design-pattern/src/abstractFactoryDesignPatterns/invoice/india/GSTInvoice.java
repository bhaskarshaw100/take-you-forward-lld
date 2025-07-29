package abstractFactoryDesignPatterns.invoice.india;

import abstractFactoryDesignPatterns.invoice.Invoice;

public class GSTInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating GST Invoice for India.");
    }
}
