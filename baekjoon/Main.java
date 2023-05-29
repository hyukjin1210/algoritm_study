package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        String x = br.readLine();
        sb.append(x);
        String reverse = String.valueOf(sb.reverse());
        System.out.println(x.equals(reverse));

    }
}