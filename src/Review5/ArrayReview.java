package Review5;

public class ArrayReview {
    public static void main(String[] args) {
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);


        }
        String [] colors={"black","white","red","Purple","blue"};
        for (String color:colors){
            System.out.print(color+" ");

        }
        System.out.println();
        for (int x:arr){
            System.out.println(x);
        }
        System.out.println();
        //Printing in reverse
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);

        }
    }
}
