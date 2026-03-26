package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Individual Products
        CartItem book = new Product("Atomic Habits", 499);
        CartItem phone = new Product("iPhone", 82900);
        CartItem charger = new Product("20W Charger", 1999);
        CartItem earbuds = new Product("AirPods", 24900);

        //Combo deal
        ProductBundle iphoneCombo = new ProductBundle("iPhone Essentials Combo");
        iphoneCombo.addItem(phone);
        iphoneCombo.addItem(charger);
        iphoneCombo.addItem(earbuds);

        ProductBundle schoolKit = new ProductBundle("Back to School Kit");
        schoolKit.addItem(new Product("Notebook pack", 249));
        schoolKit.addItem(new Product("Pen Set", 99));
        schoolKit.addItem(new Product("Highlighter", 149));

        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        System.out.println("Your Amazon cart");
        double total = 0;
        for(CartItem item : cart){
            item.display("  ");
            total+=item.getPrice();
        }

        System.out.println("\nTotal: Rs." + total);
    }
}
