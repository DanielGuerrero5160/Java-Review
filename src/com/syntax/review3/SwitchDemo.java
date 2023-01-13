package com.syntax.review3;

public class SwitchDemo {
    public static void main(String[] args) {
        int worldCup=2022;

        switch (worldCup){
            case 2028:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println(" Winner is France");
            case 2014:
                System.out.println("Winner is Germany");
                break;
            default:
                System.out.println("Who gives a fuck about the past or future");
        }
    }
}
