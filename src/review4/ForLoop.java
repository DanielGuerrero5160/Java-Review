package review4;

public class ForLoop {
    public static void main(String[] args) {
//best loop-Used when we know how many times we want to repeat block of code
        for (int i = 0; i < 10; i++) {
           if(i==6){
               break;
            }
            System.out.println(i);
        }
//break and continue
        //Break stops the loop
        //continue means to skip and continue
        System.out.println("**********");
        for (int i = 0; i <10 ; i++) {
            if(i%2==0){
                System.out.println(i);
                continue;
            }
            System.out.println("Yooooo");
        }
    }
}
