package Review9;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> computers =new ArrayList<>();
        computers.add("dell");
        computers.add("lenovo");
        computers.add("mac");
        computers.add("windows");
        computers.add("HP");

        System.out.println(computers);

        for (int i = 0; i < computers.size(); i++) {
            System.out.println(computers.get(i));
        }
        System.out.println("****************************************");
        for(String s:computers){
            System.out.println(s);
            if(s.equals("HP")){
                System.out.println("I have an hp");
            }
        }



    }
}
