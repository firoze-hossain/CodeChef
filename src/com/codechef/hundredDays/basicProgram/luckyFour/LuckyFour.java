package com.codechef.hundredDays.basicProgram.luckyFour;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '4') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
