package review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            i++;
            System.out.println(i);

            do{
                System.out.println("do while");
                i++;
            }while(i<5);
            System.out.println("****************");
        }
        Scanner input=new Scanner(System.in);
       String answer;
        do {
            System.out.println("Do you understand loops in java");
             answer = input.next();
        }while(answer.equalsIgnoreCase("yno"));
    }
}
