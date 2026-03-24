package adapter;

// A compatible implementation - directly implements the target interface (no adapter needed)
public class PayUGateway implements PaymentGateway{
    @Override
    public void pay(String orderId, double amount){
        System.out.println("Paid Rs." + amount + " using PayU for order: " + orderId);
    }
}
