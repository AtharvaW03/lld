package bridge;

public class SmartTVPlayer extends VideoPlayer{
    public SmartTVPlayer(VideoQuality quality){
        super(quality);
    }

    public void play(String title){
        System.out.println("Smart TV Platform: ");
        quality.load(title);
    }
}
