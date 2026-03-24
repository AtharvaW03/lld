package adapter;

// Adaptee - third-party API with an incompatible interface
public class RazorpayAPI {
    // Different method name and parameter names than what our system expects
    public void makePayment(String invoiceId, double amountInRupees){
        System.out.println("Paid Rs." + amountInRupees + " using Razorpay for invoice: " + invoiceId);
    }
}
