package lec05acm.io;

import java.util.Scanner;

public class P1239 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }
        cin.close();
    }
}
