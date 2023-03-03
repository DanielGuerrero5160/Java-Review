package Review10;

import java.util.*;

public class CollectionViewOfMap {
    public static void main(String[] args) {
        Map<String,Double> groceryLinked =new LinkedHashMap<>();
        //store values in map
        groceryLinked.put("Milk",5.99);
        groceryLinked.put("Eggs",7.99);
        groceryLinked.put("Bread",2.99);
        groceryLinked.put("Tea",4.99);
        groceryLinked.put("Cucumber",2.50);

       Set<String> keys= groceryLinked.keySet();
       for (String key:keys){
           System.out.print(key+" "+groceryLinked.get(key));
       }
        System.out.println();
        System.out.println("**********************");
       Iterator<String> i=keys.iterator();
       while(i.hasNext()){
           String k=i.next();
           System.out.print(k+" = "+groceryLinked.get(k)+" ");

       }
        System.out.println("_____________________________");
        Collection<Double> values=groceryLinked.values();
        for (Double value:values){
            System.out.print(value+" ");
        }
        System.out.println();

    }
}
