package decorator;

public class ChocolateCone implements IceCreamConeConstituents{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }
}
