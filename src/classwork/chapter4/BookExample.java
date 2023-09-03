package classwork.chapter4;

public class BookExample {
    public static void main(String[] args) {
//        Example1
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 =" + x % y);
        System.out.println("y mod 10 =" + y % x);

//        Example2
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

//        Example3
        int i = 1;
        int j = 2;
        int k;
        int h;
        k = ++j;
        h = i++;
        k++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("h = " + h);

//        Example4
        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int q = 3;
        int w = 6;
        int e = q | w;
        int r = q & w;
        int t = q ^ w;
        int u = (~q & w) | (q & ~w);
        int o = ~q & 0x0f;
        System.out.println("q = " + binary[q]);
        System.out.println("w = " + binary[w]);
        System.out.println("q|w = " + binary[e]);
        System.out.println("q&w = " + binary[r]);
        System.out.println("q ^ w = " + binary[t]);
        System.out.println("(~q & w) | (q & ~w) = " + binary[u]);
        System.out.println("~q = " + binary[o]);

//        Example5
        byte n = 64, m;
        int v;
        v = n << 2;
        m = (byte) (n << 2);
        System.out.println("n " + n);
        System.out.println("v and m: " + v + " " + m);

//        Example6
        int p;
        int num = 0xFFFFFFE;
        for (p = 0; p < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }

//        Example7
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte z = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(z >> 4) & 0x0f] + hex[z & 0x0f]);

    }
}

