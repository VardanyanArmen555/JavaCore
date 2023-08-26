package classwork.chapter2;

public class ForSeample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " poxos");
            if (i == 50) {
                System.out.println(i + " petros");
            }

        }

        int j;
        for(j=0;j<100;j++) {
            System.out.println("poxos");
        }
        System.out.println(j);
        System.out.println("petros");


        for (int k = 0; k < 10; k++) {
            System.out.print((k + 1) + " ");
        }



        for (int x = 10; x > 0; x--) {
            System.out.print(" " + x);
        }
    }
}
