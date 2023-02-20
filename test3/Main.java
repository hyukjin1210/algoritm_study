package test3;

public class Main {
    public int solution(int num) {  //맥주 개수
        int beer = 0;   //서비스 맥주개수

        for (int i = num -10; i >=0; i-=10) {
            beer++;
            i += 1;
        }
        return beer;
    }
    public static void main(String[] args) {
        Main method = new Main();


        System.out.println(method.solution(9911));
    }
}
