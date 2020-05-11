package lec08ds2;

import java.util.Arrays;

public class XiaoMing1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        //(1,2,3,4,5,6,7)=> (0,3,3,4,5,6,7)
        int n=a.length;
        int tot=0;
        for(int j=0;j<n-1;j++){//O(n^2logn)
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            tot+=a[j]+a[j+1];
            a[j+1]+=a[j];
            a[j]=0;

        }
        System.out.println(tot);

    }
}
