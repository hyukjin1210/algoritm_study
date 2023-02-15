import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static String solution() {
        String answer = "";

        return answer;
    }
    public static void main(String[] args) {
//        2차원 배열
        int[][] twoArr = new int[4][4];
        int[][] twoArr2 = new int[4][4];

        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < twoArr[0].length; j++) {
                twoArr[i][j] += twoArr2[i][j];
                System.out.println(Arrays.toString(twoArr));
            }

        }

    }
}
/* 조건

 */