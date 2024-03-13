package decorator;

import coffee.ICoffee;

public class EspressoDecorator extends AbstractCoffeeDecorator{

    private final ICoffee coffee;

    public EspressoDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void createCoffee() {
        System.out.println("Adding expresso");
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 100;
    }
}
