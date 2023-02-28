package com.codechef.solveProblemUsingJava.determineScore;

import java.util.Scanner;

public class DetermineScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int points_per_testcase = x / 10;
            int score = points_per_testcase * n;
            System.out.println(score);
        }
    }
}
