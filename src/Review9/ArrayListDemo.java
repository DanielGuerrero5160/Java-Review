package Review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        //store values inside an arraylist
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //how to find size of arraylist
        int size=numbers.size();
        System.out.println(size);
        //to access values/elements
        int index3=numbers.get(3);
        System.out.println(index3);
        //remove a value
        numbers.remove(3);
        //we can also remove a specific valuefor strings

        //re-assign a value in an arraylist
        numbers.set(1,566);
        System.out.println(numbers);

    }
}
