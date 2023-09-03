package homeWorks;

public class FigurePainter {
    public static void main(String[] args) {
//        Painter1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Painter2
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Painter3
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Painter4
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
