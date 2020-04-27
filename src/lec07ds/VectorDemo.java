package lec07ds;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 1, 3, 3};
        Vector<Integer> v = new Vector<>();//[]
        for (int i = 0; i < arr.length; i++) {
            if (v.contains(arr[i])) continue;//O(n)
            v.add(arr[i]);
        }
        Collections.sort(v);
        System.out.println(v);

    }
}
