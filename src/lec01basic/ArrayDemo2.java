package lec01basic;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};//double capacity
        int[] b = new int[a.length * 2];//b=[0,0,0,0,0,0]
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("b=" + Arrays.toString(b));
        a = b;//b=[1,2,3,0,0,0]
        System.out.println("b=" + Arrays.toString(b));
        a[3] = 5;//b=[1,2,3,5,0,0]
        System.out.println("b=" + Arrays.toString(b));
    }
}
