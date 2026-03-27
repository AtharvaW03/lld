package bridge;

public class Main {
    public static void main(String[] args) {
        VideoPlayer player1 = new WebPlayer(new SDQuality());
        player1.play("Interstellar");

        VideoPlayer player2 = new MobilePlayer(new HDQuality());
        player2.play("Inception");

        VideoPlayer player3 = new SmartTVPlayer(new UltraHDQuality());
        player3.play("Cars");
    }
}
