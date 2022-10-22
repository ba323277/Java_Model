package bouquet;

import java.util.HashMap;
import java.util.Map;

public class CostOfBouquet {
    public static  void main(String args[]){
        Bouquet b= new Bouquet("rose","ROSE","Lily","Jasmine");
        System.out.println(b.calculate());

        Map<String, Integer> map= new HashMap<>();
        map.put("ROSE",2);
        map.put("Lily",3);
        System.out.println(new Bouquet(map).calculate());
    }
}
