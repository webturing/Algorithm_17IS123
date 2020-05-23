package contest1515;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int T = cin.nextInt(); T-- > 0; T--) {
            int n = cin.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();

            }
            int[] s = new int[n + 1];
            s[0] = 0;
            for (int i = 1; i <= n; i++) {
                s[i] = s[i - 1] + a[i - 1];

            }
            int j = 0;
            for (int i = 0; i <= n; i++) {
                if (s[i] > s[j]) j = i;
            }
            int k = j - 1;
            for (int i = k; i >= 0; i--)
                if (s[i] < s[k]) k = i;
            System.out.println(s[j] - s[k]);
        }
    }
}
