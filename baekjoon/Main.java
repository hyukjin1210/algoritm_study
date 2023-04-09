package baekjoon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max;

        if (x >= y && x >= z) {
            max = x;
        } else if (y >= x && y >= z) {
            max = y;
        } else {
            max = z;
        }


        if (x == z && y == z) {
            System.out.println(10000 + (x * 1000));
        } else if (x == y || x == z) {
            System.out.println(1000 + (x * 100));
        } else {
            System.out.println(max * 100);
        }

    }
}
