package ProxyPattern;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public String downloadVideo(String videoURL) {
        System.out.println("Downloading video from URL: " + videoURL);
        return "Video content from " + videoURL;
    }
}
