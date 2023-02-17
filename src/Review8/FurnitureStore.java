package Review8;

import com.sun.security.jgss.GSSUtil;

public class FurnitureStore {
    public static void main(String[] args) {
        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort();
        Furniture table=new Table();
        table.comfort();
        table.assemble();

        Table t=new Table();//need to create table of table class to call its unshared method.
        //cannot call the method from furniture class as furniture cannot access that method.

        //compile time polymorphism through method overloading. The compiler knows which method we want to execute by the parameters.
        t.buildTable();
        t.buildTable("Wood");

        Chair.breaks();//accessing static methods thru class name
        Table.breaks();//accessing static methods thru class name

        System.out.println("**********************");

        //proof that breaks method is not being overridden.
        chair.breaks();//this will call the breaks method in the parent class instead of the child class.
        //this is not what we want because we cannot access the implementation of the method in the child class.
    //We should access the static methods like the above, thru class name
    }
}
