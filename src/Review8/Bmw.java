package Review8;

import Review7.Car;

public class Bmw extends Car {

     Bmw(String make, String model) {
         super(make, model);
     }
         public void start(){
             System.out.println(make+" Starts");
         }
    protected void drive(String destination, int speed){//different parameters than above
        System.out.println(make+" is going to "+destination+ "at speed:"+speed+"mph");

    }

    void brake(){
        System.out.println(make+" brakes");
    }
    }

