package com.codechef.solveProblemUsingJava.continuationBasicMath.reviewProblem2;

import java.util.Scanner;

public class ReviewProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n >= ((k * (k + 1)) / 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
