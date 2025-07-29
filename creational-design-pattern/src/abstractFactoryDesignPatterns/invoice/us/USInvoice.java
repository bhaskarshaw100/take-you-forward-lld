package abstractFactoryDesignPatterns.invoice.us;

import abstractFactoryDesignPatterns.invoice.Invoice;

public class USInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Invoice as per US norms.");
    }
}
