import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    문제 설명
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로
    바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

    제한 사항
    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.


    입출력 예
    s	return
    "try hello world"	"TrY HeLlO WoRlD"
    입출력 예 설명
    "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다.
    각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면
    "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
     */
    public String solution(String s) {
        String answer = "";
//        1.문자열s는 한개이상의 단어로 구성 되어있다.
//        2. 각 단어는 하나 이상의 공백문자가 있다.
//        3.각 단어의 짝수번째 알파벳은 대문자, 홀수번째 알파벳은 소문자로 바꾼 문자열을 만들어라
//        4. n번째 공백인지를 기준으로 짝/홀수를 판별해야 한다.
//        5. 첫번째 글자는 0번째인덱스로 보아 짝수번째 알파벳이다.

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
//        1.문자열s는 한개이상의 단어로 구성 되어있다.
//        2. 각 단어는 하나 이상의 공백문자가 있다.
        String s = "try hello world";
//        3.각 단어의 짝수번째 알파벳은 대문자, 홀수번째 알파벳은 소문자로 바꾼 문자열을 만들어라

//        System.out.println(T.solution(5));
    }
}