package lec09greedy;
import java.util.*;
import java.io.*;
public class Item {

    int start;
    int end;

    public Item(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public String toString() {
        return String.format("[%d,%d]", start, end);

    }

    public static void main(String[] args) {
      Scanner cin=new Scanner(System.in);
      //Scanner cin=new Scanner(new File("test.int"));
        Item[] items = new Item[cin.nextInt()];
        for (int i = 0; i < items.length; i++) {
            
            items[i] = new Item(cin.nextInt(), cin.nextInt());
           // System.out.println(items[i]);
        }
      //  Arrays.sort(items, (o1, o2) -> o1.start - o2.start);//按照起点排序无法得到最优解 1
       // Arrays.sort(items, (o1, o2) -> (o1.end-o1.start) - (o2.end-o2.start));//按照长度排序无法得到最优解
           Arrays.sort(items, (o1, o2) -> o1.end- - o2.end);//按照终点排序得到最优解
        System.out.println(Arrays.toString(items));
        cin.close();
    }

}