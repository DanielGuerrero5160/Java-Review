package Review5;

import java.util.Scanner;

public class ProjectReveiwTask7 {
    public static void main(String[] args) {
        //write a program to check if a giver number is prime or not
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int numEntered = input.nextInt();
        boolean isPrime = true;
        if (numEntered > 1) {
            for (int i = 2; i < numEntered; i++) {
                if (numEntered % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }else{
            isPrime=false;
        }
        System.out.println(" given number " + numEntered + " is prime? " + isPrime);


    }

}
