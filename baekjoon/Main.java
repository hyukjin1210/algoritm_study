package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        String s = br.readLine();   //로마정수
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s);
        }


    }
}