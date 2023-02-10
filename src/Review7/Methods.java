package Review7;

public class Methods {
    //user defined methods: with return type and without return type
    //with parameters and without parameters

    void hello(){
        System.out.println("Hello");
    }

    //method to find largest number between two given integer values

    int largest(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    double averageDub(double a, double b){
        return (a+b)/2;
    }

    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    //returns reverse string from a given string
String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
}


    public static void main(String[] args) {
        String name="Daniel";
        int length=name.length();
        System.out.println(length);


        Methods mt=new Methods();
        mt.sayHello("Daniel");//calling method with parameters
        mt.hello();//no parameter method
int largerNum=mt.largest(11,10);
        System.out.println(largerNum);
       double ave= mt.averageDub(2.2,4.6);
        System.out.println(ave);
        String rev=mt.reverse("Daniel");
        System.out.println(rev);


        String mystr="Batch15";
        boolean isEmpty=mystr.toUpperCase().isEmpty();
        System.out.println(isEmpty);
    }

}
