package com.codechef.hundredDays.basicProgram.countTheHolidays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountTheHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int weeklyHolidays[] = {6, 13, 20, 27, 7, 14, 21, 28};
            Set<Integer> set = new HashSet<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int festDay = sc.nextInt();
                set.add(festDay);

            }
            for (int wh : weeklyHolidays) {
                set.add(wh);
            }
            System.out.println(set.size());
        }
    }
}
