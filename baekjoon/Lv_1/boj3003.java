package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
        StringTokenizer st =  new StringTokenizer(br.readLine(), " ");

        int [] arr = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - Integer.parseInt(st.nextToken());
            System.out.print(arr[i] + " ");
        }
    }
}
