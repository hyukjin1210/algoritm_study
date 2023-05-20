package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    //과목 수
        double [] arr = new double[N];
        double sum = 0; //평균 값 찾기
        double score = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            sum += ((arr[i] /arr[N -1]) * 100);    //배열 요소의 합
            score = sum / N;   //더한 값을 배열의 길이만큼 나눈 값 = 평균
        }
        System.out.println(score);
    }
}
