package chapter7;

import java.util.Scanner;
import java.util.SplittableRandom;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("please input b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("pleaase input + or -");
        String op = scanner.nextLine();
        if (op.equals("+")) {
            System.out.println(a + b);
        }else if (op.equals("-")){
            System.out.println("unsupported");
        }
//        System.out.println("Please input full name");
//        String fullName = scanner.nextLine();
//        String[] fullNameArray = fullName.split(" ");
//        System.out.println(fullNameArray[0]);
//        System.out.println(fullNameArray[1]);
    }

}
