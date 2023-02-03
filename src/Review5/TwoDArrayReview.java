package Review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int [][] array={{1,2,3},
                {11,12,13},
                {20,21,22},
        };
        int numberOfArrays= array.length;//tells us how many 1d arrays are in the 2d array
        System.out.println(numberOfArrays);
        System.out.println("**********");
        int numberOfElementsInArray=array[0].length;//number of elements in first array
        System.out.println(numberOfElementsInArray);
        System.out.println("************");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
            System.out.println("****");
            for (int[] arr:array){//iterates over the individual 1D arrays of the 2D array
                for(int b:arr){//iterates each element in that array
                    if(b%2==0) {
                        System.out.print(b + " ");//prints those elements, then the outer loop goes to the second 1D array
                    }
                }
                System.out.println();
            }


    }
}
