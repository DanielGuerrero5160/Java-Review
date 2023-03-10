package Review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String,Double> groceries=new HashMap<>();
        groceries.put("Soap",10.99);
        groceries.put("Eggs",4.99);
        groceries.put("Milk",3.99);
        groceries.put("Dragon Fruit",12.99);
        groceries.put("Beer",18.99);
        groceries.put("Squid",10.99);

        groceries.entrySet().forEach(e->{
            String key=e.getKey();
            double value=e.getValue();
            if((key.contains("a")||key.contains("e"))&&value>8.00){
                System.out.println(key+" "+value);
            }
        });
    }
}
