package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
        StringTokenizer st =  new StringTokenizer(br.readLine(), ",");
        String [] strs = new String[st.countTokens()];
        StringBuilder same = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = st.nextToken();

        }
        Arrays.sort(strs);  //루프를 돌기 전 정렬
        String word = strs[0];  //정렬 후 첫번 째 인덱스의 값을 기준으로 검색할 것이기 때문에 저장
        String chk = strs[strs.length -1];  //배열은 0부터 시작이기 때문에 -1로 배열의 길이를 맞춰줌
        StringBuilder prefix = new StringBuilder();
        int i = 0;  //겹치는 문자가 있다면 카운트가 증가하게끔 설정
        while (true) {
            if (i < word.length() && i < chk.length() && word.charAt(i) == chk.charAt(i)) {
                i++;
                prefix.append(word.substring(0, i));
            } else {
                prefix.append("");
            }
            break;
        }
        System.out.println(prefix);

    }
}