package lec14dp2;

public class PrimerFunction {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPrimer(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimer(int n) {//O(sqrt(n))
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
