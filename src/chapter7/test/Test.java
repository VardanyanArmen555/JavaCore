package chapter7.test;

public class Test {
    int a, b;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

}
