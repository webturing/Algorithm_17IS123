package lec14dp2;

public class MatrixChains {
    public static void main(String[] args) {
        int n = 6;
        int[] M = new int[]
                {30, 35, 15, 5, 10, 20,25};


        System.out.println(f(M, 1, 6));
    }

    private static int f(int[] p, int i, int j) {//纯粹的递归算法O(4^n/(n^(2/3)))卡特兰常数
        if (i == j) return 0;
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            //从k处断开 第一部分是计算i,k这段，第二部分是计算k+1,j这段
            ans = Math.min(f(p, i, k) + f(p, k + 1, j) + p[i-1] * p[k] * p[j], ans);
        }
        return ans;
    }
}

