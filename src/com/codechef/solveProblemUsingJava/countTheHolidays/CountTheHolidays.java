package com.codechef.solveProblemUsingJava.countTheHolidays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CountTheHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele);
            }
            ArrayList<Integer> weekend = new ArrayList<>(Arrays.asList(1, 7, 8, 14, 15, 21, 22, 28, 29));
            a.addAll(weekend);
            HashSet<Integer> unique = new HashSet<>(a);
            System.out.println(unique.size());
        }
    }
}
