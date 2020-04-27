package lec07ds;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] a=new int[3];
        int  j=0;
        a[j++]=1;
        a[j++]=2;
        a[j++]=3;
        System.out.println(Arrays.toString(a));
        int [] b=new int[a.length*2];//倍增
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;//放弃原来的数组，重新指向一个长度加倍的数组
        a[j++]=4;
        System.out.println(Arrays.toString(a));

    }
}
