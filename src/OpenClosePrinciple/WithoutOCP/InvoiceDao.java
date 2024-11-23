package OpenClosePrinciple.WithoutOCP;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        // Logic to save to DB
    }

    public void saveToFile(){
        // Logic to save to file
    }
}
