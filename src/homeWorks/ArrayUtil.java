package homeWorks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
//        բոլոր էլեմենտները
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
//        առաջին էլեմենտը
        System.out.println("առաջին էլեմենտը: " + numbers[0]);

//        վերջին էլեմենտը
        int a = numbers.length - 1;
        System.out.println("վերջին էլեմենտը: " + numbers[a]);

//        մասիվի երկարությունը
        System.out.println("մասիվի երկարությունը: " + numbers.length);

//        մասիվի ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("մասիվի ամենափոքր թիվը: " + min);

//        մեջտեղի թիվը
        if (numbers.length % 2 == 0) {
            System.out.println("մեջտեղի թիվը: " +
                    numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        } else {
            System.out.println("մեջտեղի թիվը: " + numbers[numbers.length / 2]);
        }

//        զույգերի քանակը
        int h = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                h++;
            }
        }
        System.out.println("զույգերի քանակը: " + h);

//        կենտերի քանակը
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                m++;
            }
        }
        System.out.println("կենտերի քանակը: " + m);

//        էլեմենտների գումարը
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d = d + numbers[i];
        }
        System.out.println("էլեմենտների գումարը: " + d);

//        թվերի միջին թվաբանականը
        double g = 0;
        for (int i = 0; i < numbers.length; i++) {
            g = g + numbers[i];
        }
        g = g / numbers.length;
        System.out.println("թվերի միջին թվաբանականը: " + g);

    }

}