package Review9;

public class Bank {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setName("Daniel");
        customer.setSsn(12345678);
        System.out.println("SSN of the customer is "+customer.getSsn());
        System.out.println("Name of the customer is "+customer.getName());


        PrivateClient pc=new PrivateClient("Donny",3459304304l);
        System.out.println(pc.getName());
        System.out.println(pc.getSsn());
    }
}
