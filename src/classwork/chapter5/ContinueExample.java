package classwork.chapter5;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }

        outer:
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if (k > j) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (j * k));
            }
        }
        System.out.println();

    }

}
