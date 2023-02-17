package Review7;

public class Tesla extends Car{

    String type;
    boolean autoPilot;

    public void drive(int speed){//overriding method from parent class
        System.out.println(make+" drives with speed: "+speed+"- this is an overridden method");

    }

   public Tesla(String make, String model, int horsePower, int year,String type,boolean autoPilot){
        super( make, model, horsePower, year);//passing constructor of super class
        //this is also initializing the instance variables of the super class.
        //through inheritance, this child class has everything the parent or super class has
        this.type=type;
        this.autoPilot=autoPilot;
    }
    protected void haveAutopilot(){
        System.out.println(make+" have auto pilot "+autoPilot);
    }



}
