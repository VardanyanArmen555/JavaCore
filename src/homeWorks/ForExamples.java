package homeWorks;

public class ForExamples {
    public static void main(String[] args) {
//        Ex1
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + 1);
            if (i != 999) {
                System.out.print("-");
            }

        }

//        Ex2
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

//        Ex3
        int[] array = {2, 5, 8, 4, 3, 9, 7,};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max =" + max);

    }

}