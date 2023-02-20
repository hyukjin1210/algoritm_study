package test1;

public class Main {
    /*
        르탄이가 1000원을 가지고 편의점에서 물건을 사려고 한다.
        편의점에는 500원, 100원, 50원, 10원이 충분히 있고, 편의점 직원은 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.
        르탄이가 편의점에서 물건을 사고 1000원 지폐 한 장을 냈을 때, 받을 잔돈의 개수를 구하는 프로그램을 작성하여라.
        (단, 물건의 가격은 10원 이상 1000원 미만이며, 1원 단위는 고려하지 않는다.)
         */
    public int solution(int num) {
        int answer = 0;
        int tmp = 1000 - num;   //거스름돈

        while (tmp > 0){    //거스름돈이 0보다 크면 계속 도는 while문
            if (tmp >= 500) {   //거스름돈이 500원보다 크다면
                tmp = tmp % 500;    //500원을 나누고 난 나머지를 tmp에 저장
                answer++;   //거스름돈의 개수 증가
            }else if (tmp < 500 && tmp >= 100) {
                tmp = tmp - 100;
                answer++;
            }else if (tmp < 100 && tmp >= 50) {
                tmp = tmp - 50;
                answer++;
            } else if (tmp < 50 && tmp >= 10){
                tmp = tmp - 10;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int num1 = 160;

        System.out.println(method.solution(900));
    }
}