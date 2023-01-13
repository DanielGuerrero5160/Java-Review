package com.syntax.review3;
import java.util.Scanner;
public class While {

    public static void main(String[] args) {
        int i=0;
        while(i<=4){
            System.out.println("Hello");
            i++;
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Are you tired?");
        boolean tired=input.nextBoolean();
        while(!tired) {
            System.out.println("Lets study java");
            System.out.println("Are you tired?");
            boolean tried=input.nextBoolean();
            }
        System.out.println("Lets go to bed");
        }

        }




