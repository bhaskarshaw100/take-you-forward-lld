package abstractFactory.invoice.us;

import abstractFactory.invoice.Invoice;

public class USInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Invoice as per US norms.");
    }
}
