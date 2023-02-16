package programmers.Lv_0;

public class subString {
    /*
    문제 설명
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
    solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

    제한 사항
    s는 길이 1 이상, 길이 8 이하인 문자열입니다.
    s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

    입출력 예
    s	return
    "a234"	false
    "1234"	true

     */
    public boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();    //s안에 문자를 소문자로 모두변경.

        if (s.length() != 4 && s.length() != 6) {    //문자열 s의 길이가 4 혹은 6 이 아니면 false를 리턴.
            return false;
        }
        for (int i = 0; i < s.length(); i++) {  //문자열 길이만큼 도는 for문
            char c = s.charAt(i);   //char타입으로 변환
            if (c < '0' || c > '9') {   //변환시킨 변수 c의 값 비교 0보다 작거나 9보다 크면 false를 리턴.
                return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        subString T = new subString();


        System.out.println(T.solution("2234"));
    }
}