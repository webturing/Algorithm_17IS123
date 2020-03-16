package lec01basic;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //foreach
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        //Array dump
        System.out.println(Arrays.toString(a));
    }
}
