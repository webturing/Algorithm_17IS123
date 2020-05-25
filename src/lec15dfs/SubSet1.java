package lec15dfs;

public class SubSet1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < (1 << n); i++) {//2^n
            System.out.println(Integer.toBinaryString(i));

        }
    }
}
