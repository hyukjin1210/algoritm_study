package programmers.Lv_0;

public class xLength {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        long a = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a;
            a += x;
        }
        return answer;
    }
}
