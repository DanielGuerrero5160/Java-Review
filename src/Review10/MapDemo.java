package Review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double> grocery =new HashMap<>();
        //store values in map
        grocery.put("Milk",5.99);
        grocery.put("Eggs",7.99);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.50);

       double teaPrice=grocery.get("Tea");
        System.out.println(teaPrice);

        System.out.println(grocery);

        Map<String,Double> groceryLinked =new LinkedHashMap<>();
        //store values in map
        grocery.put("Milk",5.99);
        grocery.put("Eggs",7.99);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.50);

        System.out.println("order is reserved "+groceryLinked);

        Map<String,Double> groceryTree =new TreeMap<>();
        //store values in map
        grocery.put("Milk",5.99);
        grocery.put("Eggs",7.99);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.50);

        System.out.println(groceryTree.size());
        System.out.println(groceryTree);
    }
}
