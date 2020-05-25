package lec15dfs;

/**
 * 5 3 0.5
 * x+y+z=100
 * 5x+3y+z/2=100
 */
public class Chickens {
    final static int N = 10000;

    public static void main(String[] args) {
        //x*5 + y*3+ z/2==100
        // x+y+z==100;
        for (int x = 0; x <= N; x++)
            for (int y = 0; y <= N; y++)
                for (int z = 0; z <= N; z++) {//O(N^3) 三维搜索
                    if (x + y + z == N && 5 * x + 3 * y + z / 2 == N&&z%2==0) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }

    }

}
