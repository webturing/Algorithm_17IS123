package contest1516;

public class A {
    static int N = 100;

    public static void main(String[] args) {
        for (int x = 0; 5 * x <= N; x++) {
            for (int y = 0; 3 * y <= 100; y++) {
                int z = N - x - y;
                if (z % 3 != 0) continue;
                if (5 * x + 3 * y + z / 3 != N) continue;
                System.out.println(String.format("cock=%d,hen=%d,chicken=%d", x, y, z));
            }
        }
    }
}
