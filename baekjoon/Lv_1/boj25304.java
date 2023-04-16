package baekjoon.Lv_1;

import java.util.Scanner;

public class boj25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += a * b;
        }
        System.out.println(sum == x ? "Yes" : "No");
    }
}

/**
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 출력
 * x = 총 금액
 * n = 물건 종류의 수
 * a = 물건의 금액
 * b = 물건의 개수
 */