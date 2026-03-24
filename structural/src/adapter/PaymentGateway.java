package adapter;

// Target interface that the client (CheckoutService) depends on
public interface PaymentGateway {
    void pay(String orderId, double amount);
}
