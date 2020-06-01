package lec17bfs2;

public class QueueDemo1 {
    static int[] data = new int[100];
    static int front = 0, rear = -1;
    //data[front:rear]
    static void init() {
        data = new int[100];
        front = 0;
        rear = -1;
    }
    static boolean offer(int ele){
        data[++rear]=ele;
        return true;
    }
    static boolean poll(){
        if(front>rear)
            return false;
        ++front;
        return true;
    }
    static int peek(){
        return data[front];
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            offer(i);
        }
        while(!isEmpty()){
            System.out.print(peek());
            poll();
        }
    }

    public static boolean isEmpty() {
        return front>rear;
    }
}
