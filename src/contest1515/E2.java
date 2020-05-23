package contest1515;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int T = cin.nextInt(); T-- > 0; T--) {
            int n = cin.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
            int gBest = 0;
            int curSum = 0;
            for (int i = 0; i < n; i++) {
                if (curSum < 0) {
                    curSum = 0;
                } else {
                    curSum += a[i];
                    gBest = Math.max(gBest, curSum);
                }
            }
            System.out.println(gBest);
        }
    }
}
