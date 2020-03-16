package lec01basic;

import java.util.Scanner;

public class P1289 {
    public static void main(String[] args) {
        int[] a = new int[10000];
        int n = 0;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            a[n] = cin.nextInt();
            n++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
