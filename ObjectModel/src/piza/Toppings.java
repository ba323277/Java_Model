package piza;

public class Toppings {

    private int costOfTomato=10;
    private int costOfCorn=10;
    private int costOfMushRooms=10;

    private int toppingsCost=0;

    public void addToppings(String toppings) throws Exception {
        switch (toppings.toLowerCase()){
            case "tomato" : toppingsCost= costOfTomato;break;
            case "corn": toppingsCost= costOfCorn; break;
            case "mushroom" : toppingsCost= costOfMushRooms;break;
            default: throw new Exception("toppings is not found");
        }
    }


    public int getToppingsCost() {
        return toppingsCost;
    }

}
