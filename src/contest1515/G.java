package contest1515;


import java.util.Scanner;

//f(n)=min(1+f(n-1),1+f(n-2),1+f(n-5).....1+f(n-10))
public class G {
    public static void main(String[] args) {
        int[] dp = new int[1000000 + 1];
        //dp[i] 代表i元硬币的最少兑换数量
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 1; i <= n; i++) {
            dp[i] = i;//初始值 表示i元至少可以用i个一元的来兑换
        }
        dp[1] = dp[2] = dp[4] = dp[5] = dp[10] = 1;//货币单位都可以用1个来兑换
        for (int i = 3; i <= n; i++) {
            if (i >= 1) dp[i] = Math.min(1 + dp[i - 1], dp[i]);
            if (i >= 2) dp[i] = Math.min(1 + dp[i - 2], dp[i]);
            if (i >= 4) dp[i] = Math.min(1 + dp[i - 4], dp[i]);
            if (i >= 5) dp[i] = Math.min(1 + dp[i - 5], dp[i]);
            if (i >= 10) dp[i] = Math.min(1 + dp[i - 10], dp[i]);
        }
        System.out.println(dp[n]);
    }
}
