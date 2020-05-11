package lec08ds2;

import java.util.Arrays;
import java.util.Stack;

public class SuffixExpression {
    static boolean isNumber(String tok) {
        return tok.matches("\\d+");
    }

    public static void main(String[] args) {
        String exp = "1 2 + 3 4 + *";
        String[] toks = exp.split("\\s+");
        System.out.println(Arrays.asList(toks));
        Stack<Double> S = new Stack<>();
        for (String tok : toks) {
            if (isNumber(tok)) {
                S.push(Double.parseDouble(tok));
            } else {
                double b = S.peek();
                S.pop();
                double a = S.peek();
                S.pop();
                if (tok.equals("+")) {
                    S.push(a + b);
                } else if (tok.equals("*")) {
                    S.push(a * b);
                }
            }
        }
        System.out.println(S.peek());

    }
}

