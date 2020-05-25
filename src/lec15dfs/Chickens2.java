package lec15dfs;

/**
 * 5 3 0.5
 * x+y+z=100
 * 5x+3y+z/2=100
 */
public class Chickens2 {
    final static int N = 10000;

    public static void main(String[] args) {
        //x*5 + y*3+ z/2==100
        // x+y+z==100 => x+y<=N  N-x
        long start = System.currentTimeMillis();
        for (int x = 0; x <= N/5; x++)
            for (int y = 0; y <= N/3; y++)     //O(N^2) 二维搜索
            {
               if(x+y>N)continue;
                int z = N - x - y;

                if (x + y + z == N && 5 * x + 3 * y + z / 2 == N && z % 2 == 0) {
                    System.out.println(x + " " + y + " " + z);
                }
            }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
