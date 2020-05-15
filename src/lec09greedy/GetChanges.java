package lec09greedy;

import java.util.*;

public class GetChanges {
    public static void main(final String[] args) {
        final Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        // final int[] B = new int[] { 100, 50, 20, 10, 5, 2, 1 };
        int B[] = new int[] { 100, 50, 20, 10, 5, 4, 2, 1 };
        int i = 0;
        while (n > 0) {
            while (B[i] <= n) {
                System.out.println(B[i]);
                n -= B[i];
            }
            i++;
        }
        cin.close();
    }
}