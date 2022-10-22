package bouquet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Bouquet {

    private List<String> collectFlowers= new ArrayList<>();

    public Bouquet(String... flowers){
        collectFlowers= Arrays.asList(flowers);
    }

    public Bouquet(Map<String,Integer> flowers){
       for(Map.Entry map:flowers.entrySet()) {
           for(int i=0;i<(int)map.getValue();i++) {
               collectFlowers.add((String) map.getKey());
           }

       }
    }

    public int calculate(){
      int cost= (int) (collectFlowers.stream().filter(x->x.equalsIgnoreCase(Flower.ROSE.name())).count()*Flower.ROSE.getValue());
      cost=cost+ (int) (collectFlowers.stream().filter(x->x.equalsIgnoreCase(Flower.LILY.name())).count()*Flower.LILY.getValue());
      cost=cost+ (int) (collectFlowers.stream().filter(x->x.equalsIgnoreCase(Flower.JASMINE.name())).count()*Flower.JASMINE.getValue());
      return cost;
    }

}
