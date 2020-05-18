package lec06api;

public class PolyExpression {
    static int linearPower(int a, int n) {//O(n)=O(n-1)
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = (res * a);
        }
        return res;
    }

    static int quickPower(int a, int n) {//O(logN)
        if (n == 0 || a == 1) return 1;
        if (n == 1) return a;
        int t = quickPower(a, n / 2);
        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * a;
        }
    }


    static int f(int[] a, int x) {//O(n^2)
        int n = a.length - 1, s = 0;
        for (int i = n; i >= 0; i--) {//O(n)
            s += a[n - i] * linearPower(x, i);//O(n)
        }
        return s;
    }

    static int f1(int[] a, int x) {//O(nlogN)
        int n = a.length - 1, s = 0;
        for (int i = n; i >= 0; i--) {//O(n)
            s += a[n - i] * quickPower(x, i);//(logi<logN)
        }
        return s;
    }

    //ax^3+bx^2+cx+d=(ax^2+bx+c)x+d=((a*x+b)x+c)x+d=> O(n)
    static int f2(int[] a, int x) {//horner准则O(n)
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s * x + a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, -7};// f(x) 3*x^3+2*x^2+x-7
        int x = 3;
        System.out.println(f(a, x));
        System.out.println(f1(a, x));
        System.out.println(f2(a, x));
    }
}
