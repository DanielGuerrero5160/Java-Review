package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = false;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case has passed");
        } else {
            System.out.println("Test case failed");
        }
        System.out.println("**************Logical OR****************");

        boolean dashboard = false;
        String message = "Welcome admin";

        if (dashboard || message.equals("welcome admin")) {
            System.out.println("user is successfully logged in");

        } else {
            System.out.println("user is not logged in");
        }

        System.out.println("********Logical Not************");

        boolean b=true;
        System.out.println(!true);//false

        boolean agreeCheckBoxSelected=false;

        if(!agreeCheckBoxSelected){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");

    }
}
