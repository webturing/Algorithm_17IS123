package lec08ds2;

import java.util.Stack;

public class BraceMatchChecker {
    public static void main(String[] args) {
        boolean flag = check("((()))()");
        System.out.println(flag);
    }

    private static boolean check(String s) {
        Stack<Character> S = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                S.push(c);
            } else if (c == ')') {
                if (S.isEmpty()) {
                    return false;
                } else if (S.peek() != '(') {
                    return false;
                } else {
                    S.pop();
                }
            }
        }
        return S.isEmpty();

    }
}
