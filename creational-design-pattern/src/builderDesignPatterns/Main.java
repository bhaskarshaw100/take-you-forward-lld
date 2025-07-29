package builderDesignPatterns;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BurgerMeal burgerMeal = new BurgerMeal.BurgerBuilder("Garlic Bread", "Chicken Patty")
                .withCheese(true)
                .withDrink("Diet Coke")
                .withSide("French Fries")
                .withToppings(List.of("tomatoes", "cucumber"))
                .build();

        System.out.println(burgerMeal);
    }
}
