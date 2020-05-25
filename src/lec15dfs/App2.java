package lec15dfs;

public class App2 {

    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++)
            for (int b = 1; b <= 9; b++) {
                if (a == b) continue;
                for (int c = 1; c <= 9; c++) {
                    if (c == a || c == b) continue;
                    for (int d = 1; d <= 9; d++) {
                        if (d == c || d == b || d == a) continue;
                        for (int e = 1; e <= 9; e++) {
                            if (e == d || e == c || e == b || e == a) continue;
                            for (int f = 1; f <= 9; f++) {
                                if (f == e || f == d || f == c || f == b || f == a) continue;
                                for (int g = 1; g <= 9; g++) {
                                    if (g == f || g == e || g == d || g == c || g == b || g == a) continue;
                                    for (int h = 1; h <= 9; h++) {
                                        if (h == g || h == f || h == e || h == d || h == c || h == b || h == a)
                                            continue;
                                        int i = 45 - a - b - c - d - e - f - g - h;
                                        int x = a * 100 + b * 10 + c;
                                        int y = d * 100 + e * 10 + f;
                                        int z = g * 100 + h * 10 + i;
                                        if (y == 2 * x && z == 3 * x)
                                            System.out.println(String.format("%d %d %d %d %d %d %d %d %d", a, b, c, d, e, f, g, h, i));
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }
}
