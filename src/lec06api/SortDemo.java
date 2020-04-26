package lec06api;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] word = "to know everything is to know nothing".split(" ");
//        Arrays.sort(word, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        });
        Arrays.sort(word, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.asList(word));
    }
}
