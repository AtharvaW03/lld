package bridge;

public class UltraHDQuality implements VideoQuality{
    public void load(String title){
        System.out.println("Streaming " + title + " in 4k Ultra HD Quality.");
    }
}
