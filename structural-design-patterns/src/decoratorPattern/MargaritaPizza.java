package decoratorPattern;

public class MargaritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Margarita Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
