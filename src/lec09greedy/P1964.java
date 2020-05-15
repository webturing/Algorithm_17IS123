
import java.util.Arrays;

public class P1964 {
    public static void main(String[] args) {
        int[] B = new int[10];//9!~1!
        B[1] = 1;
        for (int i = 2; i <= 9; i++) B[i] = B[i - 1] * i;
        System.err.println(Arrays.toString(B));
        int n = 131;
        for (int i = 9; i >= 1; i--) {
            if (B[i] <= n) {
                n -= B[i];
                System.err.println(i + "!=" + B[i]);
            }
        }
        System.err.println(n);
    }
}
