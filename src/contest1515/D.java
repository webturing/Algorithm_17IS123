package contest1515;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    static int N = 1000000;
    static int[] primer = new int[N + 1];

    static {
        Arrays.fill(primer, 1);//假设所有的数都是素数
        primer[0] = primer[1] = 0;//删除0,1
        for (int i = 2; i * i < primer.length; i++) {
            if (primer[i] == 1) {
                for (int j = 2 * i; j < primer.length; j += i) {
                    //j>i && j%i==0 j 一定是合数
                    primer[j] = 0;//删除j
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int tot = 0;
        if (n >= 3) tot++;//2,3就是一组
        for (int i = 3; i + 2 <= n; i += 2) {
            //check i ,i+2 是不是素数
            if (primer[i] == 1 && primer[i + 2] == 1) {
                ++tot;
            }
        }
        System.out.println(tot);
    }
}
