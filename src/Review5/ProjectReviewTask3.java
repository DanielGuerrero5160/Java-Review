package Review5;

public class ProjectReviewTask3 {
    public static void main(String[] args) {


        int[][] arr = {{1, 2, 3, 4, 5},
                {24, 456, 856},

        };
        int sum = 0;
        for (int[] a : arr) {
            for (int b : a) {
                sum += b;
            }
        }
        System.out.println("Sum of all elements in array is:"+sum);
    }
}


