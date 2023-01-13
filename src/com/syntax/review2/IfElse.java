package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {
        /* if statement
        if(boolean condition){
        code a;
        } else{
        code b;
        }
         */
        int num=12;

        if(num>100){
            System.out.println(num+" is greater than 100");
        }else{
            System.out.println(num+" is less than 100");
        }
        String expectedButton="Enroll Today";

        if(expectedButton.equals("Enroll Today")){
            System.out.println("Test case pass");
        }else{
            System.out.println("Test case failed");
        }
    }
}
