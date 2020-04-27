package lec07ds;


import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1220b {
    public static void main(String[] args) {
        int n = cin.nextInt();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            int cur = cin.nextInt();
            if (v.contains(cur)) continue;
            v.add(cur);
        }
        Collections.sort(v);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);
}
