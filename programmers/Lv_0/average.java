package programmers.Lv_0;

import java.util.Scanner;

public class average {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            answer = sum / arr.length;
        }
        return answer;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        average ava = new average();
//        ava.solution();
        System.out.println(ava);

    }
}
/* 조건
 * Math.abs 사용
 * boolean[] signs
 * signs[i] == true
 *
 *  */