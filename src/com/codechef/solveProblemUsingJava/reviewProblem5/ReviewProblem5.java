package com.codechef.solveProblemUsingJava.reviewProblem5;

import java.util.Scanner;

public class ReviewProblem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            int remain_days = (k * 7) - x;
            System.out.println(remain_days);
        }
    }
}
