package com.codechef.solveProblemUsingJava.condReviewProb3;

import java.util.Scanner;

public class CondReviewProb3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            int m = read.nextInt();
            int k = read.nextInt();
            int days = m * k;
            if (days >= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
