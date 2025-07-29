package decoratorPattern;

public class Main {
    public static void main(String[] args) {
//        Pizza MargaritaCheesePizza = new ExtraCheese(new MargaritaPizza());
//        Pizza MargaritaCheeseOlivePizza = new ExtraOlive(MargaritaCheesePizza);
//        System.out.println(MargaritaCheeseOlivePizza.getDescription());
//        System.out.println("Total Cost: "+ MargaritaCheeseOlivePizza.getCost());


//        Pizza plainCheesePizza = new ExtraCheese(new PlainPizza());
//        Pizza plainCheeseOlivePizza = new ExtraOlive(plainCheesePizza);
//        System.out.println(plainCheeseOlivePizza.getDescription());
//        System.out.println("Total Cost: "+ plainCheeseOlivePizza.getCost());

        Pizza chickenCheesePizza = new ExtraCheese(new ChickenPizza());
        Pizza chickenCheeseOlivePizza = new ExtraOlive(chickenCheesePizza);
        System.out.println(chickenCheeseOlivePizza.getDescription());
        System.out.println("Total Cost: "+ chickenCheeseOlivePizza.getCost());
    }
}
