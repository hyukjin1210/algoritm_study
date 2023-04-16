package baekjoon.Lv_1;

import java.io.*;
import java.util.StringTokenizer;

public class boj11021 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt();
//        for (int i = 1; i <= T; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            System.out.println("Case #" + i + ": " + (a + b));
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + (a + b) + "\n");
        }
        bw.close();
    }
}
