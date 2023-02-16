package programmers.Lv_0;

public class test {
    int i = 5;
    long solution(int a, int b) {

        long answer = 0;

        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer = answer + 1;
            }
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                answer = answer + 1;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    public void main(String[] args) {
        test ex = new test();
        ex.solution(1,2);

        System.out.println("result = ");
    }
}
