package Review8;

public class InsuranceTest {
    public static void main(String[] args) {

        PetPolicy p=new PetPolicy("123334","Daniel",3,100.0);
        System.out.println(p.calculateCoverage());
        p.getInsurance();

        CarPolicy c=new CarPolicy("325453","John",150,25);
        c.calculateCoverage();
        c.getInsurance();

        Insurance carPolicy=new CarPolicy("I349u3","Sam",200,33);//creating a car policy object of type insurance
        System.out.println(carPolicy.calculateCoverage());
        carPolicy.getInsurance();

       Insurance petPolicy=new PetPolicy("nslfn92583","Julia",10,500);
        System.out.println(petPolicy.calculateCoverage());
        petPolicy.getInsurance();

        Insurance[] arr={new CarPolicy("I349u3","Sam",200,33), new PetPolicy("nslfn92583","Julia",10,500)};
        for(Insurance x:arr){
            x.getInsurance();
            x.calculateCoverage();
        }
    }
}
