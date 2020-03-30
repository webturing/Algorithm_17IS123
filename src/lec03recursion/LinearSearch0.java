package lec03recursion;

public class LinearSearch0 {
    // 时间复杂度
    // 最坏情况复杂度 T=n
    // T=1
    // 平均复杂T=(1+2+...n)/n=(n+1)/2
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        //n=a.length;
        int k = 1;
        int pos = find(a, k, 0, a.length - 1);//O(n)

        System.out.println(pos);

    }

    //search k in A[p:q]
    private static int find(int[] a, int k, int p, int q) {
        for (int i = p; i <= q; i++) {

            if (a[i] == k) {
                return i;
            }
        }
        return -1;

    }
}
