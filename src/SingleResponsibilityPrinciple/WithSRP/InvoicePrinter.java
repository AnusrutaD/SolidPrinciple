package SingleResponsibilityPrinciple.WithSRP;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        // logic rto print invoice
    }
}