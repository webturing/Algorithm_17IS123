package lec15dfs;

import java.util.Arrays;

public class Perm1 {
    public static void main(String[] args) {
        for (int x = 123; 2 * x <= 987; x++) {
            for (int y = x + 1; y < 987; y++) {
                int z = x + y;
                String s = "" + x + y + z;
                char cs[] = s.toCharArray();
                Arrays.sort(cs);
                if (new String(cs).equals("123456789")) {
                    System.out.println(String.format("%d+%d=%d", x, y, z));
                }
            }
        }
    }
}
