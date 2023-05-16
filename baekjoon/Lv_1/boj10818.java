package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10818 {
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
