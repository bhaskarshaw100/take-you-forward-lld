package BridgePattern;

public class Main {
    public static void main(String[] agrs) {
        VideoPlayer videoPlayer = new WebPlayer(new HDQuality());
        videoPlayer.play("Cricket Match - India VS England");

        System.out.println("Now I will switch to Mobile");

        VideoPlayer videoPlayerMobile = new MobilePlayer(new Ultra4KQuality());
        videoPlayerMobile.play("Cricket Match - India VS England");
    }
}
