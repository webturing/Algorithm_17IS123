package lec15dfs;

import java.util.Arrays;

public class App1 {

    public static void main(String[] args) {
        int[] a = new int[10];
        a[1] = 1;
        for (int i = 2; i <= 9; i++) a[i] = i * a[i - 1];

        int n=130;//n=6!+3!+1! = 1!*1 + 2!*0 +3!*1 +4!*0+....9!*0=127
        for(int i=0;i<(1<<9);i++){
            int [] b=new int[9];
            for(int j=0;j<9;j++){
                b[j]=(i>>j)&1;
            }

            //a[1]*b[0]+a[2]*b[1]+...+a[9]*b[8]===n?
            int s=0;
            for(int j=0;j<9;j++){
                s+=a[j+1]*b[j];
            }
            if(s==n){
                System.out.println(i+" "+ Arrays.toString(b));
            }
        }
    }
}
