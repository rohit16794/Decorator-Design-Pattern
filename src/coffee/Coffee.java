package coffee;

public class Coffee implements ICoffee{
    @Override
    public void createCoffee() {
        System.out.println("This is a simple coffee");
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
