package programmers.Lv_0;

public class year {
    public static String solution(int a, int b) {
        String answer = "";
        int[] day = {31, 29, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        String[] date = {"FRI","SAT", "SUN","MON","TUE","WED","THU",};
        int total = 0;

        for (int i = 0; i < a - 1; i++) {
            total += day[i];
        }
        total = total + b - 1;  //모든 일자 더하기
        answer = date[total % 7];   //
        return answer;
    }
    //삼항연산자로 푸는 것이 더 간결하게 코드가 나온다.
    public static void main(String[] args) {
        System.out.println(solution(5,20));
    }
}
/*
12개월 각 날짜 ->
int []
 */