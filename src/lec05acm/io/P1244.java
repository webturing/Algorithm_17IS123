package lec05acm.io;

import java.util.Scanner;

public class P1244 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int tot = 0;
            for (int m = cin.nextInt(); m-- > 0; ) {
                tot += cin.nextInt();
            }
            System.out.println(tot);
        }
        cin.close();

    }
}
