package review4;

public class MoreNestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j = 0; j <=4; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("bye");
        }
    }
}
