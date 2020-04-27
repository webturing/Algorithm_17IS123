package lec07ds;
//V:[1,2,3,4]

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//E:[1,{2,3}][2,{3,4}],[3,{}],[4,{1}]
//G=(V,E)
public class GraphDemo {
    public static void main(String[] args) {
        Map<Integer, Set<Integer>> G = new TreeMap<>();
        for (int i = 1; i <= 4; i++) {
            G.put(i, new TreeSet<>());
        }
        System.out.println(G);
        G.get(1).add(2);
        G.get(1).add(3);
        G.get(2).add(3);
        G.get(2).add(4);
        G.get(4).add(1);
        System.out.println(G);
    }
}
