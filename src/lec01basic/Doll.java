package lec01basic;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Doll {
    public static void main(String[] args) {
        Vector<Integer> balls = new Vector<>();
        for (int i = 1; i <= 35; i++) {
            balls.add(i);
        }
        System.out.println(balls);
        Collections.shuffle(balls);
        System.out.println(balls);
        List<Integer> award = balls.subList(0, 6);
//        Collections.sort(award, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        for (Integer i : award)
            System.out.print(i + " ");

    }
}
