package note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 완성시키시오
 *  첫 줄에 자연수 N (3<= N <= 20)이 주어집니다.
 *  두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다.
 *  단어는 영어 알파벳으로만 구성되어 있습니다.
 */
public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            sb.append(new StringBuilder(word).reverse().append("\n"));

        }
        System.out.println(sb);
    }

}
