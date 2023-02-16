package programmers.Lv_0;

public class searchKim {
    /*
        문제 설명
        String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수,
        solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

        제한 사항
        seoul은 길이 1 이상, 1000 이하인 배열입니다.
        seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
        "Kim"은 반드시 seoul 안에 포함되어 있습니다.

        입출력 예
        seoul	return
        ["Jane", "Kim"]	"김서방은 1에 있다"

         */
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {    //배열의 길이만큼 도는 for문
            if (seoul[i].equals("Kim")) {   //seoul[for문의 i].equals 로 문자열과 일치하는지 비교
                answer = "김서방은 " + i + "에 있다";  //answer 에 대입.([i]는 문자열배열 이기 때문에 equals로 비교하였다. 그러므로 따로 변환없이 바로 사용 가능.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        searchKim T = new searchKim();
        String[] names = {"Queen", "Tod","Kim"};


        System.out.println(T.solution(names));
    }
}