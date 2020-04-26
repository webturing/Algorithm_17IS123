package lec06api;

import java.util.*;
import java.util.stream.Collectors;

public class JavaNew {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(new Integer[]{71, 12, 33, 44, 55, 66, 99, 100, 101});

        a.forEach(System.out::println);

        System.out.println();
        a.stream().map(x -> x * 2).forEach(System.out::println);
        System.out.println();

        a.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("sum=" + a.stream().reduce(0, (x, y) -> (x + y)));
        System.out.println("product=" + a.stream().reduce(0, (x, y) -> (x * y)));
        System.out.println("max=" + a.stream().reduce(0, Math::max));
        System.out.println("min=" + a.stream().reduce(0, Math::min));

        Collections.shuffle(a);
        System.out.println(a);
        Collections.sort(a, (x, y) -> x - y);
        System.out.println(a);
        Collections.sort(a, (x, y) -> y - x);
        System.out.println(a);
        Collections.sort(a, (x, y) -> x % 10 - y % 10);//按照个位数排序
        System.out.println(a);
    }
}