package Review5;

public class ProjectReviewTask8 {
    public static void main(String[] args) {
        //print first number of fibonacci
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b+" ");

        for (int i = 0; i < 10; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
