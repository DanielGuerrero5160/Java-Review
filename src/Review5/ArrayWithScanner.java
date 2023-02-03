package Review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many names do you want to store");
        int elements= input.nextInt();
        String[] names=new String[elements];
        //this loop stores elements inside the array
        for(int i=0;i< names.length;i++){
            System.out.println("Please enter name");
            names[i]= input.next();
        }
        //using loop below, we can retrieve elements of the array
        for (String name:names){
            System.out.print(name+" ");
        }

    }
}
