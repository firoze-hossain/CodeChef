package com.codechef.solveProblemUsingJava.debugExam;

import java.util.Scanner;

public class DebugExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int total_score = a + b + c;
            int min_score = Math.min(a, Math.max(b, c));
            if (total_score >= 100 && min_score >= 10) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
