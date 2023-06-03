package Leetcode.easy;

import Leetcode.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RomaInt {
    public int romaToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int cal = map.get(s.charAt(s.length() -1));
        for (int i = s.length() -1; i >= 0; i--) {
            int num = map.get(s.charAt(i));
            if (num >= cal) {
                total += num;
            } else {
                total -= num;
            }
            cal = num;
            System.out.println(num);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        RomaInt solution = new RomaInt();
        System.out.println(solution.romaToInt(s));
    }
}
