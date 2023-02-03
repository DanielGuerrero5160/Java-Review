package review4;

public class MoreLoops {
    public static void main(String[] args) {
        for (int i = 0; i <=3; i++) {

            for (int j = 1; j <=3 ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i=0;i<=9;i++) {

            for (int j = 0; j <= 9; j++) {

                for (int k = 0; k <= 9; k++) {

                    for (int l = 0; l <= 9; l++) {

                        System.out.println(i+(j) + ":" + k + "" + l);
                    }

                }
            }
        }
            //digital clock output test
            System.out.println();
            for (int i = 0; i <= 2; i++) {
                for (int j = 1; j <=4; j++) {
                    for (int k = 0; k <= 5; k++) {
                    for(int l=0;l<=9;l++){
                    System.out.println(i + " " + j + ":" + k+" "+l);
                    }

                    }
                }
            }

    }
}
