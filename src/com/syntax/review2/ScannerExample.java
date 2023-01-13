package com.syntax.review2;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        int i=10;
        // scanner is a non-primitive data type
        Scanner input=new Scanner (System.in);
        System.out.println("Please enter a number");
        int y=input.nextInt();
        System.out.println(y);

      //  input.next(); To capture string until space
        //input.nextLine(); To capture whole string/whole line

    }
}
