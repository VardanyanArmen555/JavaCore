package chapter6;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 25;

        vol = myBox1.width * myBox1.depth * myBox1.height;
        System.out.println("Volume is " + vol);

    }
}
