package classwork.chapter7.overload;

import classwork.chapter7.overload.OverLoad;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        double result;
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);

        ob.test(10);
        result = ob.test(123.35);
        System.out.println("Result of ob.test(123.35): " + result);


    }
}
