package homeWorks.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;


    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    void add(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;

    }

    int getByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return 0;
        }
        return array[index];
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);
        array = tmp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
        }
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return;
        }
        array[index] = value;
    }

    int getSize (){
        return size;
    }

    boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
