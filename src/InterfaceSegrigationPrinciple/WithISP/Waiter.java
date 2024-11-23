package InterfaceSegrigationPrinciple.WithISP;

public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("Serve the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("Take orders");
    }
}
