package BridgePattern;

public class Ultra4KQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Loading Ultra 4K Video Quality for " + title);
    }
}
