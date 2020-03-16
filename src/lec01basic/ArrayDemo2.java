package lec01basic;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        a[3] = 5;
    }
}
