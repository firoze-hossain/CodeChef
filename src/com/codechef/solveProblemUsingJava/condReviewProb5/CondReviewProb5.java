package com.codechef.solveProblemUsingJava.condReviewProb5;

import java.util.Scanner;

public class CondReviewProb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a != b && a != c && b != c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
