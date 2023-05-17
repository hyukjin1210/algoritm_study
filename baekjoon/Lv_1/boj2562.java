package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();

        int [] arr = new int[9];  //9개의 자연수를 담은 배열
        int max = 0;    //최대값
        int cnt = 0;
        int stop = 0;   //몇번째 위치에 있는지

        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int value : arr) {
            cnt++;
            if (value > max) {
                max = value;
                stop = cnt;
            }
        }
        System.out.println(max);
        System.out.println(stop +1);

    }
}
