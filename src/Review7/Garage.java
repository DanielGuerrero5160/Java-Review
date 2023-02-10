package Review7;

public class Garage {
    public static void main(String[] args) {
        Tesla tesla=new Tesla("Tesla","Model 3",450,2022,"Electric",true);
        tesla.haveAutopilot();//subclass/child class
        tesla.drive(100);//this is using an overridden drive method in the child class
        tesla.start();//from super class
tesla.drive(100,"Miami");
    }
}
