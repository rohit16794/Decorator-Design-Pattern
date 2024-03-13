package decorator;

import coffee.ICoffee;

public class FlavoredSyrupDecorator extends AbstractCoffeeDecorator{

    private final ICoffee coffee;

    public FlavoredSyrupDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void createCoffee() {
        System.out.println("Added flavored syrup");
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 200;
    }
}
