package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        Nested if is 1 if statement inside another if statement. IF the first statement is true,
         it will check the others. When we have 1 condition that depends on another.
         */
        boolean vaccine=true;
        int dose=0;
        if (vaccine){
            System.out.println("How many doses do you have?");
            if(dose==1){
                System.out.println("Need a second shot");
            }else{
                System.out.println("You are fully vaccinated!");
            }

            }else{
            System.out.println("You should get the vaccine");
        }
    }
}
