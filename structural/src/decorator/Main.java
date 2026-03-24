package decorator;

public class Main {
    public static void main(String[] args) {
        // Start with a basic Margherita Pizza
        Pizza myPizza = new MargheritaPizza();

        myPizza = new ExtraCheese(myPizza);

        myPizza = new Olives(myPizza);

        myPizza = new StuffedCrust(myPizza);

        // Final Description and Cost
        System.out.println("Pizza Description: " +
                myPizza.getDescription());
        System.out.println("Pizza Cost: " +
                myPizza.getCost());
    }
}
