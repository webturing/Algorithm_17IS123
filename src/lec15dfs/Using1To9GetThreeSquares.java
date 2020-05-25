package lec15dfs;

import java.util.Arrays;

public class Using1To9GetThreeSquares {
    public static void main(String[] args) {
        for (int a = 13; a * a <= 987; ++a)
            for (int b = a + 1; b * b <= 987; ++b)
                for (int c = b + 1; c * c <= 987; ++c) {
                    char[] cs = ("" + a * a + b * b + c * c).toCharArray();
                    Arrays.sort(cs);
                    if (new String(cs).equals("123456789"))
                        System.out.println(String.format("%d %d %d", a * a, b * b, c * c));
                }
    }
}
