package programmers.Lv_0;

public class MinusPlus {
    public int answer(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer += (absolutes[i] * -1);
            }

        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
