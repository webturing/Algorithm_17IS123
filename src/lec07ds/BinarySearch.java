package lec07ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class BinarySearch {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1, 6, 1, 3, 10, 7, 8, 3));
        Collections.sort(v);
        System.out.println(v);
        Integer k = 7;
        System.out.println(Collections.binarySearch(v, k));
        Collections.sort(v, Collections.reverseOrder());
        System.out.println(v);
        System.out.println(Collections.binarySearch(v, k, (x, y) -> -x - (-y)));
        System.out.println(Collections.binarySearch(v, k, Comparator.comparingInt(x -> -x)));
    }
}
