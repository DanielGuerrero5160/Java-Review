package review4;

public class NestedLoops {
    public static void main(String[] args) {

        //nested loop is a loop inside another loop
        //inner loop always depends on outer loop
        for(int i=1;i<=3;i++){

            for (int j = 0; j <=i; j++) {
                System.out.println(j);

            }
            System.out.println();
        }
        System.out.println("**********");
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");
            for (int j = 1; j <=2 ; j++) {
                System.out.println("Bye ");
            }
        }
    }
}
