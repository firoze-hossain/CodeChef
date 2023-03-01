package com.codechef.solveProblemUsingJava.reviewProblem1;

import java.util.Scanner;

public class ReviewProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min_points = Math.min(7 - a, 7 - b);
            System.out.println(min_points);
        }
    }
}
