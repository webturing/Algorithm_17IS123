package lec14dp2;

import java.util.Arrays;

public class PrimerFilter {
    static int N = 100;
    static int[] primer = new int[N + 1];

    static {
        Arrays.fill(primer, 1);//假设所有的数都是素数
        primer[0] = primer[1] = 0;//删除0,1
        for (int i = 2; i*i < primer.length; i++) {
            if (primer[i] == 1) {
                for (int j = 2 * i; j < primer.length; j += i) {
                    //j>i && j%i==0 j 一定是合数
                    primer[j] = 0;//删除j
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (primer[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }


}
