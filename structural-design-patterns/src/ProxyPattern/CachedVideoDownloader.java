package ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoDownloader implements VideoDownloader {

    private RealVideoDownloader realVideoDownloader;
    private Map<String, String> cache;

    public CachedVideoDownloader() {
        this.realVideoDownloader = new RealVideoDownloader();
        cache = new HashMap<>();
    }

    @Override
    public String downloadVideo(String videoURL) {
        if(cache.containsKey(videoURL)) {
            System.out.println("Returning cached video for: " + videoURL);
            return cache.get(videoURL);
        }

        System.out.println("Cache miss. Downloading...");
        String video = realVideoDownloader.downloadVideo(videoURL);
        cache.put(videoURL, video);
        return video;
    }
}
