package Review6;

import java.util.concurrent.Flow;

public class Garden {

    void hello(){
        String name="Adem";//local variable
        System.out.println("Hello"+name);
    }


    public static void main(String[] args) {
        Flower tulip=new Flower();//creation of instance of flower class which is an object
        tulip.name="Tulip";
        tulip.price=5;
        tulip.color="red";

        tulip.grow();
        tulip.bloom();
        System.out.println("**********Second object below");

        Flower flower2=new Flower();
        flower2.name= "rose";
        flower2.price=4;
        flower2.color="blue";

        flower2.grow();
        flower2.bloom();
        System.out.println(Flower.pretty);///Since pretty is static,
        // we just need to call the class name, not an object
        System.out.println(flower2.pretty);//This works, but its not the right way to access.
        flower2.pretty=false;//pretty was true in the class, but this changes it to false in the class
        System.out.println(flower2.pretty);
        System.out.println(Flower.pretty);
        System.out.println(tulip.pretty);//Pretty is now also false for other objects of flower class.

        for (int i = 0; i <=3 ; i++) {
            System.out.println(i);
        }
       /// System.out.println(i); Not possible, as I is a local variable
        }

    }

