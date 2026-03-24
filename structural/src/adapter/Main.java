package adapter;

public class Main {
    public static void main(String[] args) {
        // RazorpayAPI is incompatible, so we use RazorpayAdapter to bridge it
        CheckoutService checkoutService = new CheckoutService(new RazorpayAdapter());

        checkoutService.checkout("55", 4322);
    }
}
