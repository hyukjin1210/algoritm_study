package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = 0;
        int [] value = new int[N];
        for (int i = 0; i < N; i++) {
            value[start] = Integer.parseInt(st.nextToken());
            start++;


        }
        Arrays.sort(value);
        System.out.println(value[0] + " " + value[N -1]);
    }
}

/**
 * 문제
 *
 * 출력
 */