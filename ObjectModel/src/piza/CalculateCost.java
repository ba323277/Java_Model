package piza;

public class CalculateCost {

    public static  void main(String args[]){
        try {
            Pizza costOfPizza= new StandardPizza("tomaato");
            System.out.println(costOfPizza.calculatePizza());
        } catch (Exception e) {
           e.printStackTrace();
        }

        try {
            Pizza costOfPizza= new SoftBasePizza("tomato");
            System.out.println(costOfPizza.calculatePizza());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
