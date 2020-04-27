package lec07ds;

import java.util.Scanner;
import java.util.TreeSet;

public class P1220c {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        int n = cin.nextInt();
        while (n-- > 0) {
            set.add(cin.nextInt());
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }

    static Scanner cin = new Scanner(System.in);
}
