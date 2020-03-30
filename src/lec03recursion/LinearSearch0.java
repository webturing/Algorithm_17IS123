package lec03recursion;

public class LinearSearch0 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int k = 17;
        int pos = find(a, k, 0, a.length - 1);

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
