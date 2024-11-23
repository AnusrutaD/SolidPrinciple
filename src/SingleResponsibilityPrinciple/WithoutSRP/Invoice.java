package SingleResponsibilityPrinciple.WithoutSRP;

// It has 3 reason to change
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = (marker.getPrice()) * this.quantity;
        return price;
    }

    public void printInvoice(){
        // logic of print
    }

    public void saveToDB(){
        // Logic to save DB

    }
}
