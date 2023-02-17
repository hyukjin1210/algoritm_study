package programmers.Lv_0;

public class Roote {
    /*
        문제 설명
        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
        n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

        제한 사항
        n은 1이상, 50000000000000 이하인 양의 정수입니다.

        입출력 예
        n	return
        121	144
        3	-1

        입출력 예 설명

        입출력 예#1
        121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

        입출력 예#2
        3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
         */
    public long solution(long n) {
        long answer = 0;

        double x = Math.sqrt(n);    //제곱근 x 를 구함
        long c = (long) x; //long타입으로 제곱근을 전환

        if(c * c != n) {    //여기서 정수타입이 아닌 double로 돌리면 안됨.
            answer = -1;    //n이 c=x의 제곱이 아니면 리턴.
        } else {
            answer = (long) Math.pow(c +1, 2);  //제곱이 맞으면 제곱근에 +1을 해서 다시 연산 후 리턴값에 저장
        }
        return answer;
    }

    public static void main(String[] args) {
        Roote T = new Roote();

        System.out.println(T.solution(121));
    }
}