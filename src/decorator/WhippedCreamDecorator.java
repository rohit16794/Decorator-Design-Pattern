package decorator;

import coffee.ICoffee;

public class WhippedCreamDecorator extends AbstractCoffeeDecorator{

    private final ICoffee coffee;

    public WhippedCreamDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void createCoffee() {
        System.out.println("added whipped cream");
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 1000;
    }
}
