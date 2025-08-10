package BridgePattern;

public class SDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Loading SD Video Quality for " + title);
    }
}
