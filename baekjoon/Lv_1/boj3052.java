package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();

        int [] arr = new int[10];   //배열의 크기 10
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(h.size());
    }
}
