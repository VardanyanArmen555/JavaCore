package chapter7.a;

public class ATest {

    public static void main(String[] args) {

        A.y = 10;
        System.out.println(A.y);
        A.name = "poxos";

        A a = new A();
        System.out.println(a.name);
        A.printHello();

    }

}
