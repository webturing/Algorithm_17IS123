package lec15dfs;

public class Demo1Flower {
    public static void main(String[] args) {
        for (int n = 100; n <= 999; n++) {//一维搜索线段（整点，格点)
            int a = n / 100;
            int b = n % 100 / 10;
            int c = n % 10;
            if (a * a * a + b * b * b + c * c * c == n) {//条件
                System.out.println(n);
            }

        }
    }
}
