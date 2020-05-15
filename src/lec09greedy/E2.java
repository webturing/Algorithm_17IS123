package lec09greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class E2 {
    static class Item implements  Comparable<Item> {
        int start, end;

        public Item(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public int compareTo(Item that) {

            return this.end-that.end;
        }
    }

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int n = cin.nextInt();
            Item[] items = new Item[n];
            boolean[] book = new boolean[n];

            for (int i = 0; i < items.length; i++) {
                items[i] = new Item(cin.nextInt(), cin.nextInt());
            }
            Arrays.sort(items);//Comparable
            Arrays.sort(items,new Comparator<Item>(){

                @Override
                public int compare(Item o1, Item o2) {
                    return o1.end-o2.end;
                }
            });//method 1
            Arrays.sort(items, (o1,o2)->(o1.end-o2.end));//method2
            Arrays.sort(items, Comparator.comparingInt(o -> -o.end));//method3
            int tot = 0;
            while (true) {
                boolean allDone = true;
                for (int i = 0; i < book.length; i++) {
                    if (book[i] == false) {
                        allDone = false;
                    }
                }
                if (allDone) {
                    break;
                }
                int start = 0;
                ++tot;
                for (int i = 0; i < items.length; i++) {
                    if (book[i] == false && items[i].start >= start) {
                        //select item[i]
                        start = items[i].end;
                        book[i] = true;

                        System.err.print(items[i]);
                    }
                }
                System.err.println();

            }

            System.out.println(tot);


        }
        cin.close();
    }

    static Scanner cin = new Scanner(System.in);
}
