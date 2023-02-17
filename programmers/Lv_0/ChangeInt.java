package programmers.Lv_0;

public class ChangeInt {
    /*
        문제 설명
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
        예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        제한 조건
        n은 10,000,000,000이하인 자연수입니다.

        입출력 예
        n	return
        12345	[5,4,3,2,1]
         */
    public int[] solution(long n) {
        long num = n;
        int cnt = 0;
        while (num > 0) { //배열 answer의 크기를 지정해주기위해 cnt의 값을 찾는 과정
            num /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];   //크기가 cnt의 값인 배열을 생성.
        num = n;
        for (int i = 0; num != 0; i++) {
            answer[i] = (int) (num % 10);
            num /= 10;
        }
        return answer;
    }

    public int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {
        ChangeInt T = new ChangeInt();

        System.out.println(T.solution(12345));
    }
}