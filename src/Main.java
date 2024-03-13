import coffee.Coffee;
import coffee.ICoffee;
import decorator.EspressoDecorator;
import decorator.FlavoredSyrupDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ICoffee simpleCoffee = new Coffee();
        ICoffee expressoAddedCoffee = new EspressoDecorator(simpleCoffee);
        expressoAddedCoffee.createCoffee();
        System.out.println(expressoAddedCoffee.getPrice());

        ICoffee flavoredCoffee = new FlavoredSyrupDecorator(expressoAddedCoffee);
        System.out.println(flavoredCoffee.getPrice());
    }
}