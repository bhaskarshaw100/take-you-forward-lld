package decorator;

public class OrangeCone implements IceCreamConeConstituents{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
