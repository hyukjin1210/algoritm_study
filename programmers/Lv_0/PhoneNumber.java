package programmers.Lv_0;

public class PhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        String len = "";
        len = phone_number.substring(0,phone_number.length() -4);
        for (int i = 0; i < len.length(); i++) {
            answer += "*";

        }
        return answer + phone_number.substring(phone_number.length()-4);
    }

    public static void main(String[] args) {

    }
}
/* 조건
* phoneNumber는 길이 4이상, 20이하인 문자열.
* 문자열의 끝4자리 필요
* 문자열의 끝4자리를 제외하고 *로 치환
* 두 결과값을 결합.
* */