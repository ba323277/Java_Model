package piza;

public class SoftBasePizza implements Pizza{


    private final int softCost;

    public SoftBasePizza(String topping) throws Exception {
        softCost=30;
        toppings.addToppings(topping);
    }
    @Override
    public int calculatePizza() {
        return basePrice+softCost+toppings.getToppingsCost();
    }
}
