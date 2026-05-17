package flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for(int i = 0; i < 100; i++){
            forest.plantTree(i, i, "Oak", "Green", "Rough");
        }

        forest.draw();

        System.out.println("Planted 1 hundred trees.");

    }
}
