package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        int [] nums = new int[Integer.parseInt(String.valueOf(st.countTokens()))];
        int target = Integer.parseInt(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i]  = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i+ 1] == target) {
                System.out.println("[" + i + ", " + (i +1) + "]");
                break;
            }
        }
    }
}