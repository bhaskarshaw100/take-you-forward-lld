package decoratorPattern;

public class ChickenPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Chicken Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
