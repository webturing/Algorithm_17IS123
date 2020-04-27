package lec07ds;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 6, 3, 3};
        Set<Integer> S = new TreeSet<Integer>();
        for (int i : a) {
            S.add(i);

        }
        for(Integer i:S){
            System.out.println(i);
        }

    }
}
