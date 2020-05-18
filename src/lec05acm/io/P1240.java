package lec05acm.io;

import java.util.Scanner;

public class P1240 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }
        cin.close();
    }
}
