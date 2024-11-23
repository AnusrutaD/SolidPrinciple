package InterfaceSegrigationPrinciple.WithoutISP;

public class Waiter implements ResturantEmployee{
    @Override
    public void washDishes() {
        // Not my job
    }

    @Override
    public void serveCustomer() {
        System.out.println("Serving the customer");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}
