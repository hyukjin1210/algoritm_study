package programmers.Lv_0;

import java.time.Year;

public class year {
    /*
    2016년 1월 1일은 금요일입니다.
    2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아
    2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
    예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

    제한사항
    2016년은 윤년입니다.
    2016년 a월 b일은 실제로 있는 날입니다.
    (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
     */
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU",};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
//        a값이 들어올 때 date.length에서 맞는 자리를 찾는다
//        찾은 값에서 1일부터 시작해 b의 길이만큼 day배열을 순회하며 값을 찾는다
        int total = 0;  //날짜의 합을 저장할 공간
        for (int i = 0; i < a - 1; i++) {   //a - 1을 하는이유는 해당월(Ex 5월)이면 4월까지의 date + b의 입력값이 되야하므로
            total += date[i];   //4월까지의 날짜를 저장.(121)
        }
        total = total + b - 1;  //모든 일자 더하기 2016년은 29일이 존재하므로 -1
        answer = day[total % 7];   //day배열에서 total % 7을 하고 남은 숫자만큼 인덱스 탐색


        return answer;
    }

    public static void main(String[] args) {
        year T = new year();

        System.out.println(T.solution(5,24));
    }
}