package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == s) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}

/**
 * 문제
 *
 * 출력
 */