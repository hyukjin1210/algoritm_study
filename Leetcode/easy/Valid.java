package Leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Valid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c =='[') {
                stack.push(c);
            } else  {
                if (stack.isEmpty()) return false;
                char chk = stack.pop();
                if (c == ')' && chk != '(') return false;
                if (c == ']' && chk != '[') return false;
                if (c == '}' && chk != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean isValid = isValid(s);
        System.out.println(isValid);

    }
}
