package chapter3;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        for (int i = 0; i < 5; i++) {
//            numbers[i] = i + 1;
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(numbers[i] + " ");
//        }

//        int twoD[][] = new int[4][5];
//        int i, j, k = 0;
//
//        for (i = 0; i < 4; i++)
//            for (j = 0; j < 5; j++) {
//                twoD[i][j] = k;
//                k++;
//            }
//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < 5; j++)
//                System.out.print(twoD[i][j] + " ");
//            System.out.println();

//        int twoD[][] = new int[4][];
//        twoD[0] = new int[1];
//        twoD[1] = new int[2];
//        twoD[2] = new int[3];
//        twoD[3] = new int[4];
//        int i, j, k = 0;
//        for (i = 0; i < 4; i++)
//            for (j = 0; j < i + 1; j++) {
//                twoD[i][j] = k;
//                k++;
//            }
//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < i + 1; j++)
//                System.out.print(twoD[i][j] + " ");
//            System.out.println();
//        }

        int threeD[][][] = new int[3][4][5];
        int i, j, k = 0;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k]= i*j*k;

        for (i = 0; i < 3; i++) {
            for (j =0; j<4; j++){
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k]+" ");
                    System.out.println();
            }
            System.out.println();
        }


    }
}
