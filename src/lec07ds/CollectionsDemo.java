package lec07ds;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


public class CollectionsDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v);
        for (int i = 0; i < 100; i++) {
            v.add(i);
            System.out.println(v);
        }
        System.out.println(v.size());
        Collections.sort(v);
        v.sort(Comparator.reverseOrder());
        System.out.println(v.contains(19));
        System.out.println(v.indexOf(19));
        System.out.println(v.subList(8, 10));
        Collections.shuffle(v);
        Vector<String> vs = new Vector<String>();
        Vector<Vector<Integer>> v2 = new Vector<Vector<Integer>>();
    }
}
