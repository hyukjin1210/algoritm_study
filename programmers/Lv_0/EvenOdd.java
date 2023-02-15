package programmers.Lv_0;

public class EvenOdd {
    public static String solution(int num) {
        String answer = "";
//        if(num % 2 == 0) {
//            answer = "Even";
//        } else {
//            answer = "Odd";
//        }
//        return answer;
        return num % 2 == 0 ? "Even" : "Odd";   //if 문은 삼항연산자로 교체가 가능하다.
    }

    //삼항연산자로 푸는 것이 더 간결하게 코드가 나온다.
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println(solution(4));
    }
}

