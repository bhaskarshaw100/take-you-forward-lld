package decorator;

public class Chocochips implements IceCreamConeConstituents{
    IceCreamConeConstituents iceCreamConeConstituents;

    public Chocochips(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Chocochips";
    }
}
