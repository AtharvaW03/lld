package proxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader cachedVideoDownloader = new CachedVideoDownloader();
        System.out.println("User 1 tries to download the video.");
        cachedVideoDownloader.downloadVideo("https://video.com/proxy-pattern");
        System.out.println();

        System.out.println("User 2 tries to download the same video again.");
        cachedVideoDownloader.downloadVideo("https://video.com/proxy-pattern");
    }
}
