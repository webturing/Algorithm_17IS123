package lec05acm.io;

import java.util.Scanner;

public class P1243 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int N = cin.nextInt(); N-- > 0; ) {
            int tot = 0;
            for (int m = cin.nextInt(); m-- > 0; )
                tot += cin.nextInt();
            System.out.println(tot);
        }
        cin.close();
    }
}
