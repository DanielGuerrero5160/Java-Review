package Review7;



public class InClassTask {

  public static int minVal(int[] arr){
    int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        InClassTask ic=new InClassTask();
       int[] array={6,2,3,4,5,1};
       int test= ic.minVal(array);
        System.out.println(test);
       int newMin= InClassTask.minVal(array);
        System.out.println(newMin);
        System.out.println(minVal(array));

    }

}
