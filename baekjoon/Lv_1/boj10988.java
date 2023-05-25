package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        String str = br.readLine();
        String reverse = String.valueOf(sb.append(str).reverse());
        System.out.println(str.equals(reverse) ? "1" : "0");

    }
}
