package lec15dfs;

public class SubSet2 {
    public static void main(String[] args) {

        int n = 3;
        for (int i = 0; i < (1 << n); i++) {//2^n
            int c = (i & 1);
            int b = (i >> 1) & 1;
            int a = (i >> 2) & 1;
            System.out.println(String.format("%d%d%d", a, b, c));
        }
    }
}
