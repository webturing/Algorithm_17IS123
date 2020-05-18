package lec06api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaNew {//jdk >=8.0 //jdk 11

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(new Integer[]{71, 12, 33, 44, 55, 66, 99, 100, 101});

        a.forEach(System.out::println);//concise and elegant
        //System.out.println(a[0])
        //....
        //System.out.println(a[a.length-1])

        System.out.println();
        a.stream().map(x -> x * 2).forEach(System.out::println);
        System.out.println();

        a.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("sum=" + a.stream().reduce(0, (x, y) -> (x + y)));
        System.out.println("product=" + a.stream().limit(5).reduce(1, (x, y) -> (x * y)));
        System.out.println("max=" + a.stream().reduce(a.get(0), Math::max));
        System.out.println("min=" + a.stream().reduce(a.get(0), Math::min));

        Collections.shuffle(a);
        System.out.println(a);
        Collections.sort(a, (x, y) -> x - y);//ascend
        System.out.println(a);
        Collections.sort(a, (x, y) -> y - x);//descend
        System.out.println(a);
        Collections.sort(a, (x, y) -> x % 10 - y % 10);//按照个位数排序
        System.out.println(a);
    }
}