package piza;

public class StandardPizza implements Pizza{


    public StandardPizza(String topping) throws Exception {
        toppings.addToppings(topping);
    }

    @Override
    public int calculatePizza() {
        return basePrice+toppings.getToppingsCost();
    }
}
