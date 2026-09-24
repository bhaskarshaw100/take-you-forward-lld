package decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCream = new Chocochips(new StrawberryScoop(new VanillaScoop(new OrangeCone())));
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
