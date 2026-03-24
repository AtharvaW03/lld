package adapter;

// Adapter - bridges the gap between our PaymentGateway interface and RazorpayAPI
public class RazorpayAdapter implements PaymentGateway{
    private RazorpayAPI razorpayAPI;

    public RazorpayAdapter(){
        this.razorpayAPI = new RazorpayAPI();
    }

    // Translates the pay() call into Razorpay's makePayment() call
    @Override
    public void pay(String orderId, double amount){
        razorpayAPI.makePayment(orderId, amount);
    }
}
