package classwork.chapter2;

public class IfExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x is less then y");
        }
        x=x*2;
        if (x==y){
            System.out.println("x now equal to y");
        }
        x=x*2;
        if (x>y){
            System.out.println("x now greather then y");
        }
    }
}
