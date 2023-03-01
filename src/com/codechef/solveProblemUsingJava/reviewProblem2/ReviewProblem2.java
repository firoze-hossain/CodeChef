package com.codechef.solveProblemUsingJava.reviewProblem2;

import java.util.Scanner;

public class ReviewProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int pass_without_tick = p - q;
            int fine_col = x * pass_without_tick;
            System.out.println(fine_col);
        }
    }
}
