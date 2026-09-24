package decorator;

public class VanillaScoop implements IceCreamConeConstituents {
    IceCreamConeConstituents iceCreamConeConstituents;

    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Vanilla Scoop";
    }
}
