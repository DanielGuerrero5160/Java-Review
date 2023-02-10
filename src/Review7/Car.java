package Review7;

public class Car {
    String make, model;
    int horsePower, year;

 public Car(String make, String model){
      this.make=make;
      this.model=model;

  }
    public Car(String make, String model, int horsePower, int year){
        this(make, model);//calling current class constructor
        this.horsePower=horsePower;//accessing current class instance variables
        this.year=year;

    }

    public void start(){
        System.out.println(make+" Starts");
    }
    public void drive(int speed){
        System.out.println(make+" drives with speed: "+speed);

    }
    //if the same class has 2 or more methods with the same name, we are method overloading
    //we overload by adding parameters, different order/sequence, and by changing data types
    public void drive(int speed, String destination){//different parameters than above
        System.out.println(make+" is going to "+destination+ "at speed:"+speed+"mph");

    }
    protected void drive(String destination, int speed){//different parameters than above
        System.out.println(make+" is going to "+destination+ "at speed:"+speed+"mph");

    }

    //java knows which method we are calling by looking at the
    // method signature which is the name and parameters only
    //We can overload methods with different access modifiers and return types

}


