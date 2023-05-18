package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();



        boolean[] chk = new boolean[31];
        for (int i = 0; i < 28; i++) {  //과제 제출 한 사람 찾기
            int N = Integer.parseInt(br.readLine());    //입력 값
            chk[N] = true;
        }
        for (int i = 1; i <= 30; i++) { //과제 제출 안한 사람 찾기
            if (!chk[i])
                System.out.println(i);
        }
    }
}

/**
 * 문제
 *
 * 출력
 */