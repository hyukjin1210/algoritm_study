import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    /*
    문제 설명
    양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    제한 조건
    x는 1 이상, 10000 이하인 정수입니다.

    입출력 예
    arr	return
    10	true
    12	true
    11	false
    13	false
    입출력 예 설명
    입출력 예 #1
    10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.

    입출력 예 #2
    12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.

    입출력 예 #3
    11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.

    입출력 예 #4
    13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
     */
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;    //입력값 x 를 보존하기위해 만든 변수
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        while (x > 0) {  //배열화
            arr.add(x % 10);
            x /= 10;
        }
        Collections.sort(arr);

        for (int i : arr) {  //배열안의 요소를 더해주는 과정
            sum += i;
        }

        if (tmp % sum == 0) {
            return answer;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
//        boolean answer = true;
//        int x = 13;
//        int tmp = x;    //입력값 x 를 보존하기위해 만든 변수
//        int sum = 0;
//        ArrayList<Integer> arr = new ArrayList<>();
//        while (x > 0){  //배열화
//            arr.add(x %10);
//            x /= 10;
//        }
//        Collections.sort(arr);  //오름차순 정렬
//        System.out.println(arr);    //[1,2] 출력
//        for (int i : arr){  //배열안의 요소를 더해주는 과정
//            sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(tmp);
//        System.out.println("test" + sum / tmp);
//        if(tmp % sum == 0){
//            answer = true;
//        } else {
//            answer = false;
//        }


//        1. 양의정수 x
//        문자열로 전환 후 비교?
//        2. x + y = z
//        3. z % (x + y) == 0 이면 true 리턴.
//        4.
        System.out.println(T.solution(12));
    }
}