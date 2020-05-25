package lec15dfs;

public class Perm0 {
    public static void main(String[] args) {
        //n^n >> n!
        for (int a = 1; a <= 3; a++)
            for (int b = 1; b <= 3; b++)
                for (int c = 1; c <= 3; c++) {
                    if (a != b && a != c && b != c)
                        System.out.println(String.format("%d%d%d", a, b, c));
                }
    }
}
