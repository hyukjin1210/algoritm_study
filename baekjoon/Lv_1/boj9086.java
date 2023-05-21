package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(br.readLine());   //테스트 할 문장의 개수
        for (int i = 0; i < T; i++) {
            String str = br.readLine(); //테스트 할 문장
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length() - 1)).append("\n");
        }
        System.out.println(sb);
    }
}
