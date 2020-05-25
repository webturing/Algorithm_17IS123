package lec15dfs;

public class SubSet0 {
    public static void main(String[] args) {
        //[a,b,c]  p(S)=2^|S|
        for (int a = 0; a <= 1; a++)
            for (int b = 0; b <= 1; b++)
                for (int c = 0; c <= 1; c++) {
                    System.out.println(a + "" + b + "" + c);
                }
    }
}
