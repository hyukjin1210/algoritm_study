package baekjoon.Lv_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
        int [] arr = new int[26];   //알파벳 a ~ z까지
        for (int i = 0; i < arr.length; i++) {  //배열의 요소를 전부 -1로 초기화
            arr[i] = -1;
        }

        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (arr[c -'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}
