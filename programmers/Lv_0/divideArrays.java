package programmers.Lv_0;

import java.util.Arrays;

public class divideArrays {
    /*
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
    solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

    제한사항
    arr은 자연수를 담은 배열입니다.
    정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
    divisor는 자연수입니다.
    array는 길이 1 이상인 배열입니다.
    입출력 예#1
    arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

    입출력 예#2
    arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

    입출력 예#3
    3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
     */
    public int[] solution(int[] arr, int divisor) {
        int result = 0; //이 문제의 핵심키워드(배열 arr의 길이인 size의 다음 인덱스를 탐색하기 위한 변수
        int size = 0;   //이 문제의 핵심키워드2(arr[size]로 만들예정)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) { //arr배열을 divisor로 나눈 나머지가 0 일때 새로운 배열을 생성해서 크기를 지정해주어야 함.
                size++; //배열의 length역할을 해줄 size의 값 구하기.
            }
        }
        if (size == 0) {    //배열에 나누어 떨어지는 수가 없을 경우 -1을 리턴.
            int[] answer = {-1};    //배열 answer를 생성 하면서 값 -1을 할당.
            return answer;
        }

        int[] answer = new int[size];   //새로운배열생성 (배열의 길이는 첫번째 for문에서 얻어낸 size)

        for (int i = 0; i < arr.length; i++) {  //배열에 값을 저장하기 위한 for문
            if (arr[i] % divisor == 0) {  //나누어 떨어지면~
                answer[result] = arr[i];    //배열에 저장 (size의 인덱스인 result 즉, arr[size(result)] 인셈)
                result++;   //result를 증가시켜줌으로써 arr[0] => arr[1] 로 배열의 인덱스 증가.
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        divideArrays T = new divideArrays();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;


//        System.out.println(T.solution(5,5));
    }
}