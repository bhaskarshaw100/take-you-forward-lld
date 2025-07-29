package decoratorPattern;

public class ExtraOlive extends PizzaDecorator {
    public ExtraOlive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Extra Olive";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40.0;
    }
}
