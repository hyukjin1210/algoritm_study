package programmers.Lv_0;
public class strToInt {
    public int StringToInt(String s) {
        int answer = 0;
        if (s.charAt(0) < '-') {
            answer = (Integer.parseInt(s) * -1);
            System.out.println(answer);
        } else {
            answer = (Integer.parseInt(s) *  1);
            System.out.println(answer);
        }

        return answer;
    }
    public static void main(String[] args) {
    }
}
/* 조건
 * s 의 길이 1 ~ 5
 * 부호 -1 또는 1
 * s 는 부호와 숫자로만 이루어져있다.
 * s 는 0으로 시작하지 않는다.
 *  */
//       answer = Integer.parseInt(s);
////       answer = (Integer.parseInt(s) * -1);
//       System.out.println("음수" + answer * -1);
//       System.out.println("양수" + answer);
//        if (Integer.parseInt(s) < 0) {
//            answer = Integer.parseInt(s);
//            System.out.println(answer);
//        } else {
//            answer = (Integer.parseInt(s) * -1);
//            System.out.println(answer);