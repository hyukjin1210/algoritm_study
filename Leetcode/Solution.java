package Leetcode;

import java.io.*;
import java.util.*;

public class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(x);
        sb.append(str);
        String reverse = String.valueOf(sb.reverse());
        return str.equals(reverse);
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(x));
    }
}