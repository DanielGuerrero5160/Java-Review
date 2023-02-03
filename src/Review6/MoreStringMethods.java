package Review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String myString="Today is February 2";

        String [] arr=myString.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("*******For each below");
      for(String x:arr){
          System.out.println(x);
      }

    String newString= myString.substring(8,17);
        System.out.println(newString);//february

       int index= newString.indexOf('b');
        System.out.println(index);

        String anotherStr="Today is Thursday";
       int index1= anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is: "+index1);
        int index2=anotherStr.indexOf("is");
        System.out.println(index2);
    }
}
