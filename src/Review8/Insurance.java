package Review8;

public abstract class Insurance {

    //can i have variables inside abstract class-yes
    public static String company="Geico";
    protected String policyNumber;
    public String policyHolder;

    public void getInsurance(){
        System.out.println("We need to get insurance");
    }
    public abstract double calculateCoverage();

    Insurance(String policyNumber,String policyHolder){
        this.policyNumber=policyNumber;
        this.policyHolder=policyHolder;

    }

}
class CarPolicy extends Insurance{
    double premium;
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double calculateCoverage(){
        if(age<20){
            return premium*3;
        }else if(age<40){
            return premium*.5;
        }else{
            return premium*.2;
        }

    }

    public CarPolicy(String policyNumber, String policyHolder, double premium,int age) {
        super(policyNumber, policyHolder);
        this.premium=premium;
        this.age=age;
    }
}
class PetPolicy extends Insurance{
    int numberOfPets;
    double premium;

    @Override
    public double calculateCoverage() {
        if(numberOfPets>2){
            return premium*2;
        }else if(numberOfPets>5){
            return premium*3;
        }else{
            return premium*5;
        }
    }

    public PetPolicy(String policyNumber, String policyHolder,int numberOfPets,double premium) {
        super(policyNumber, policyHolder);
        this.numberOfPets=numberOfPets;
        this.premium=premium;
    }
}
