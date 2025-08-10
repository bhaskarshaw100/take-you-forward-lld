package BridgePattern;

public class HDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Loading HD Video Quality for " + title);
    }
}
