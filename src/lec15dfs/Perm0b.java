package lec15dfs;

public class Perm0b {
    public static void main(String[] args) {
        //n^n >> n!
        for (int a = 1; a <= 3; a++)
            for (int b = 1; b <= 3; b++) {
                if (a == b) continue;
                for (int c = 1; c <= 3; c++) {
                    if (b == c) continue;
                    if (a == c) continue;
                    System.out.println(String.format("%d%d%d", a, b, c));
                }
            }
    }
}
