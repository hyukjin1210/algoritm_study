package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int min = 0;
        int max = 0;
//        st = new StringTokenizer(br.readLine(), " ");   //st의 값을 초기화해주지 않으면 밑에서 사용안됨

        for (int i = 0; i <= N; i++) {
            int value = Integer.parseInt(st.nextToken());


        }
        System.out.println(min + " " + max);
    }
}

/**
 * 문제
 *
 * 출력
 */