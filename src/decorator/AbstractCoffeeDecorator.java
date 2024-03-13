package decorator;

import coffee.ICoffee;

public class AbstractCoffeeDecorator implements ICoffee {
    @Override
    public void createCoffee() {
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
