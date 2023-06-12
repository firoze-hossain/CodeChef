package com.codechef.solveProblemUsingJava.continuationBasicMath.reviewProblem4;

import java.util.Scanner;

public class ReviewProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int n = sc.nextInt();
            int temp = 0;
            for (int i = 0; i < d; i++) {
                for (int j = 1; j <= n; j++) {
                    temp = temp + j;
                }
                n = temp;
                temp = 0;
            }
            System.out.println(n);
        }
    }
}
