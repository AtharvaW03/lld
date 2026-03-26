package facade;

public class PaymentService {
    public void makePayment(String accountId, double amount){
        System.out.println("Payment of Rs." + amount + " successful for account " + accountId);
    }
}
