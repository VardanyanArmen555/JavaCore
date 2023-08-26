package classwork.chapter3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
