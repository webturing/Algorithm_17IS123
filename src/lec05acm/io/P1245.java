package lec05acm.io;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1245 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);
        while (cin.hasNext()) {
            cout.println(cin.nextInt() + cin.nextInt());
            System.out.println();
        }
        cin.close();
    }
}
