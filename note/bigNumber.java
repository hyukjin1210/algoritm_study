package note;

import java.util.ArrayList;

/*
    설명
    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    (첫 번째 수는 무조건 출력한다)

    입력
    첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

    출력
    자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


    예시 입력 1
    6
    7 3 9 5 6 12

    예시 출력 1
    7 9 6 12
*/
public class bigNumber {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {   //입력한 n의 길이만큼 도는 for문
            if (arr[i] >= n) {   //arr[1 ~ n 의 길이] >= 입력한 n의 값
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[] arr = new int[]{7, 3, 9, 5, 6, 12};

        System.out.println(T.solution(6, arr));
    }
}
//필요
//정수 n = int n
//그 다음 줄에 N개의 정수가 입력
// int[] arr = new int arr[n];