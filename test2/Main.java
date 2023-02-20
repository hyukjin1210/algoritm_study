package test2;

public class Main {
    /*
        "OOXXOXXOOO"와 같은 OX문의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
        문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
        "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
        (단,  OX문의 결과는 0보다 크고 80보다 작은 문자열이 주어진다. 또한 문자열은 O와 X만으로 이루어져 있다.)
         */
    public int solution(String s) {
        int answer = 0; //점수의 총 합
        int cnt = 0;    //문자'X'를 만나기 전까지 더한 값
        String[] str = s.split("");
        for (int i = 0; i < s.length(); i++) {  //문자열 s의 길이만큼 도는 for문
            if (s.charAt(i) == 'O') {   //배열화 한 str[i]의 첫번째 문자를 char로 변환 후 문자'O'와 비교
                cnt++;  //참 일경우 cnt 증가
            } else {
                cnt = 0;    //거짓일 경우 cnt 초기화
            }
            answer += cnt;  //answer에 cnt를 누적
        }
        return answer;  //answer의 값을 리턴.
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "OXOOOXXXOXOOXOOOOOXO";

        System.out.println(method.solution("OXOOOXXXOXOOXOOOOOXO"));
    }
}