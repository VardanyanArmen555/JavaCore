package chapter5;

public class BreakExample {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if(i == 10) break;
//            System.out.println("i: " + i);
//        }
//        System.out.println("Loop complete.");
//    }
//
//        int i = 0;
//        while (i < 100) {
//            if (i == 10) break;
//            System.out.println("i: " + 1);
//            i++;
//        }
//        System.out.println("Loop complete.");
//
//
//        for (int j = 0; j < 3; j++) {
//            System.out.print("pass " + j + ": ");
//            for (int k = 0; k < 100; k++) {
//                if (k == 10) break;
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Loops complete");
//

        outer:
            for (int j = 0; j < 3; j++) {
            System.out.print("pass " + j + ": ");
            for (int k = 0; k < 100; k++) {
                if (k == 10) break outer;
                System.out.print(k + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete");



    }
}
