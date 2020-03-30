package lec03recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int k = 17;
        int pos = find(a, k, 0, a.length - 1);

        System.out.println(pos);

    }

    //search k in A[p:q]
    //T(n)=1+T(n-1)  T(1)=1
    //=> T(n)=n
    private static int find(int[] a, int k, int p, int q) {
        if (p == q) return k == a[p] ? p : -1;
        if (k == a[p]) return p;
        return find(a, k, p + 1, q);
    }
}
