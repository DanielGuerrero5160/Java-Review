package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        /*
        if else if is used when we need to check many conditions
         */
        int hw=7;
        if(hw>25){
            System.out.println("Great Job");
        }else if(hw>20){
            System.out.println("Good job");
        }else if(hw>10){
            System.out.println("ok job");
        }else if(hw>5) {
            System.out.println("Not good job");
        }
        System.out.println("_________________");

        String browser = "Sdfgs";

        if(browser.equals("Chrome")){
            System.out.println("Test cases executed on chrome browser");
        }else if(browser.equals("Safari")){
            System.out.println("Test cases executed on Safari browser");
        }else if(browser.equals("Firefox")){
            System.out.println("Test cases executed on Firefox browser");
        }else{
            System.out.println("unspecified browser");
        }
    }
}
