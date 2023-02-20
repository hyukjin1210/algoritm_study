package note;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class days_later {
    /*
     기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
     항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

     제한 조건
    1 ≤ month ≤ 12
    1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)
      */
    public String solution(int month, int day) {
        String answer = "";
        LocalDateTime startDate = LocalDateTime.of(2023, month, day, 0, 0);
        answer = startDate.plusDays(98).format(DateTimeFormatter.ofPattern("M월 dd일"));

        return answer;
    }

    public static void main(String[] args) {
        days_later T = new days_later();
        System.out.println(T.solution(1, 18));
    }
}