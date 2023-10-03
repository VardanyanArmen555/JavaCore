package classwork.chapter7.varArgs;

public class VarArgs1 {

    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length + " Contants: ");

        for (int x : v)
            System.out.println(x + " ");

        System.out.println();

    }

    public static void main(String[] args) {

        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();

    }

}
