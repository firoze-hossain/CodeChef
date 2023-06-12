package com.codechef.solveProblemUsingJava.continuationBasicMath.reviewProblem3_1;

import java.util.Scanner;

public class ReviewProblem3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = n; i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    System.out.println((n / i) * (m / i));
                    break;
                }
            }
        }
    }
}
