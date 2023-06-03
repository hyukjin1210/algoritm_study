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
        for (int i = 0; i < strs.length; i++) {
            strs[i] = st.nextToken();

        }
        System.out.println("공통된 접두사 찾기 전 = " + Arrays.toString(strs));






    }
}