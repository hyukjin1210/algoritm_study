package Leetcode;

import java.io.*;
import java.util.*;

public class Solution {
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
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
    }
}