package Leetcode.easy;

import Leetcode.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Longest {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];
        int i = 0;
        while (i < firstStr.length() && i < lastStr.length() && firstStr.charAt(i) == lastStr.charAt(i)) {
            i++;
        }
        return firstStr.substring(0, i);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        String [] strs = new String[st.countTokens()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = st.nextToken();
        }
        Longest solution = new Longest();
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
