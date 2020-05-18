package lec05acm.io;

import java.util.Scanner;

public class P1241 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0)
                break;
            int tot = 0;
            for (int i = 0; i < n; i++)
                tot += cin.nextInt();
            System.out.println(tot);
        }
        cin.close();
    }
}
