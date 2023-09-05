package homeWorks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
//        Ex1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
//        Ex2
        System.out.println("առաջին էլեմենտը-" + numbers[0]);

//        Ex3
        int a = numbers.length - 1;
        System.out.println("վերջին էլեմենտը-" + numbers[a]);

//        Ex4
        System.out.println("մասիվի երկարությունը-" + numbers.length);

//        Ex5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("մասիվի ամենափոքր թիվը=" + min);
//        Ex6


//        Ex7
        int h = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                h++;
            }
        }
        System.out.println("զույգերի քանակը=" + h);
//        Ex8
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                m++;
            }
        }
        System.out.println("կենտերի քանակը=" + m);

//        Ex9
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d = d + numbers[i];
        }
        System.out.println("էլեմենտների գումարը=" + d);

//        Ex10
        double g = 0;
        for (int i = 0; i < numbers.length; i++) {
            g = g + numbers[i];
        }
        g = g / numbers.length;
        System.out.println("թվերի միջին թվաբանականը=" + g);

    }

}