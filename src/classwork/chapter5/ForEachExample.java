package classwork.chapter5;

public class ForEachExample {
    public static void main(String[] args) {
//        Example1
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);

//        Example2
        sum = 0;
        for (int x : nums) {
            System.out.println("value is: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("Summation of first 5 elements:" + sum);

//        Example3
        int num[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        for (int x : num) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");
    }
}
