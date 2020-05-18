package lec07ds;

public class MyVector {
    int capacity = 1;
    int[] data = new int[capacity];
    int len = 0;

    public static void main(String[] args) {
        MyVector v = new MyVector();
        for (int i = 0; i < 10000000; i++) {
            v.add(i);

        }
        // v.print();
    }

    void add(int x) {//O(1)
        if (len == capacity) {
            System.err.println("double capacity!!!!");
            capacity *= 2;
            int[] data2 = new int[capacity];
            System.arraycopy(data, 0, data2, 0, len);
            data = data2;
        }
        data[len++] = x;
    }

    void print() {
        for (int i = 0; i < len; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println();
    }
}
