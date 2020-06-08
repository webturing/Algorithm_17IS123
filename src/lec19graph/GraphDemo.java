package lec19graph;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class GraphDemo {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> G = new TreeMap<>();//邻接表
        for (int i = 0; i < 4; i++) {
            G.put(i, new Vector<Integer>());
        }
        //0-1 1-2 2-3  1-3
        G.get(0).add(1);//
        G.get(1).add(2);
        G.get(1).add(3);
        G.get(2).add(3);

        System.out.println("图的顶点数:" + G.size());

        int edges = 0;
        for (int v : G.keySet()) {
            edges += G.get(v).size();
        }

        System.out.println("图的顶点数:" + edges);
        //删除点0
        G.remove(0);//删除0
        //删除1-3
        G.get(1).remove(3);//删除了边1-3


    }
}
