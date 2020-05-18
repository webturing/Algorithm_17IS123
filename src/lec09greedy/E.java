package lec09greedy;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    static Scanner cin = new Scanner(System.in);

    public static void main(final String[] args) {

        while (cin.hasNext()) {
            final int n = cin.nextInt();
            final Item[] items = new Item[n];
            for (int i = 0; i < items.length; i++) {
                items[i] = new Item(cin.nextInt(), cin.nextInt());
            }
            Arrays.sort(items, (o1, o2) -> o1.end - o2.end);
            int start = 0;
            int tot = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].start >= start) {
                    // select item[i]
                    start = items[i].end;
                    ++tot;
                    System.err.println(items[i]);
                }
            }
            System.out.println(tot);

        }
        cin.close();
    }

    static class Item {
        int start, end;

        public Item(final int start, final int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Item{" + "start=" + start + ", end=" + end + '}';
        }
    }
}
