package Leetcode;

import java.io.*;
import java.util.*;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        return null;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        String [] strs = new String[st.countTokens()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = st.nextToken();
        }
        Solution solution = new Solution();
    }
}