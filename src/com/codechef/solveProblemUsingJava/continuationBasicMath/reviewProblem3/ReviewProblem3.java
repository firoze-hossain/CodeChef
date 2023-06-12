package com.codechef.solveProblemUsingJava.continuationBasicMath.reviewProblem3;

import java.util.Scanner;

public class ReviewProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x % 10 == 0) {
                System.out.println(0);
            } else if ((x * 2) % 10 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
