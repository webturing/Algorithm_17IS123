package lec04divideconque;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
* 题目描述:在[1,100]之间选择6个数ABCDEF 满足A^5+B^5+C^5+D^5+E^5==F^5
* 带范围的dfs搜索
* [19, 43, 46, 47, 67, 72]
* [21, 23, 37, 79, 84, 94]
* 1.738s
* 通过测试还发现:把N=2,3,5,都可以分解（x^2+y^2=z^2 x^3+y^3+z^3=w^3 以及 A^5+B^5+C^5+D^5+E^5==F^5都有解，n=4,6都没有解...)
*/
public class FindPower5 {
static long[] b = new long[101];
static {for (int i = 1; i < b.length; i++) b[i] = 1L * i * i * i * i * i;}
static int[] a = new int[6];

static void dfs(int k, int t) {//带范围的dfs改造可以避免重复值
if (k == 5) {//搜到5层结束
long sum = 0;
for (int i = 0; i < 5; i++)sum += b[a[i]];
int f = Arrays.binarySearch(b, a[4] + 1, b.length, sum);//利用二分搜索判断a0~a4的和在不在数表b中
if (f > a[4]) {//找到一组解（如不限制就会重复5!=120次)
a[a.length - 1] = f;
System.out.println(Arrays.toString(a));
}
return;
}
for (int i = t; i < b.length; i++) {
a[k] = i;
dfs(k + 1, i);//当前选择的下表已经是i,以后的数下标不可以小于i
}
}

public static void main(String[] args) {
long start = System.currentTimeMillis();
dfs(0, 1);
long end = System.currentTimeMillis();
System.out.println(end - start);
}
}