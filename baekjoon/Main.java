package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        String str = br.readLine().toUpperCase();
        System.out.println("대문자 변환" + str);
        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));

    }
}