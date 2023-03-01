package com.codechef.solveProblemUsingJava.reviewProblem3;

import java.util.Scanner;

public class ReviewProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int min_amount = Math.min(x * 3, y * 2);
            System.out.println(min_amount);
        }
    }
}
