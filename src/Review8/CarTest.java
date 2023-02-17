package Review8;

import Review7.Car;
import Review7.Tesla;

public class CarTest {
    public static void main(String[] args) {


        Bmw bmw = new Bmw("BMW", "M3");
        bmw.start();
        bmw.brake();
        bmw.brake();
        bmw.drive("Miami",100);

        Car car=new Car("Toyota","4 Runner");
        car.start();
        car.drive(88);
        car.drive(100,"Alaska");

        Tesla t=new Tesla("Tesla","Model S",800,2022,"Electric",true);
        t.start();
        t.drive(55);
        t.drive(99,"Cali");

//Runtime Polymorphism achieved through method overriding
//casting:Widening and narrowing -used with primitives//widening happens implicitly
        //non-primitives - upcasting and down-casting //upcasting happens implicitly.
        Car bmw1=new Bmw("BMW","M3");//upcasting
        bmw1.drive(100);
        bmw1.start();
        bmw1.drive(99,"tegucigalpa");


    }
}
