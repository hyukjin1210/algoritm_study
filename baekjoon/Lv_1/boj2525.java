package baekjoon.Lv_1;

import java.util.Scanner;

public class boj2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        x += z / 60;
        y += z % 60;

        if (y >= 60) {
            x += 1;
            y -= 60;
        }

        if (x >= 24) {
            x -= 24;
        }

        System.out.println(x + " " + y);
    }
}
