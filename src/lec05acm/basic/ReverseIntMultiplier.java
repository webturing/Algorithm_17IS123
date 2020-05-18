package lec05acm.basic;

public class ReverseIntMultiplier {
    public static void main(String[] args) {
        int x = 123456;
        int y = 52;

        System.out.println(r(x));
    }

    private static int r2(int x) {//API
        String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String t = sb.toString();
        int m = Integer.parseInt(t);

        return m;
    }

    private static int r(int x) {//API
        return Integer.parseInt(new StringBuffer(Integer.toString(x)).reverse().toString());
    }

    private static int r1(int x) {//算法型
        int s = 0;
        while (x > 0) {
            s = s * 10 + x % 10;
            x /= 10;
        }
        return s;
    }


}