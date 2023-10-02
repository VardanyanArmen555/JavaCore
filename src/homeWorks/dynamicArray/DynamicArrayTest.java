package homeWorks.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(7);
        dy.add(6);
        dy.add(8);
        dy.print();
//        dy.set(2, 88);
//        dy.add(2, 88);
//        System.out.println(dy.exists(6));
//        System.out.println(dy.exists(66));
        System.out.println(dy.getIndexByValue(6));
    }
}
