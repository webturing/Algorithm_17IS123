package lec13dp;

public class EgyptFraction {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 6, b = 7;
        int g = gcd(a, b);
        a /= g;
        b /= g;
        System.out.print(a + "/" + b + "=");
        while (true) {
            int c = (b + a - 1) / a;
            //a/b - 1/c => (a*c-b)/(b*c)
            System.out.print("+" + 1 + "/" + c);
            if (a * c - b == 0) break;
            int a1 = a * c - b;
            int b1 = b * c;
            g = gcd(a1, b1);
            a1 /= g;
            b1 /= g;
            a = a1;
            b = b1;
        }
    }
}
