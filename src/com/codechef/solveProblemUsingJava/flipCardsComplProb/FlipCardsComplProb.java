package com.codechef.solveProblemUsingJava.flipCardsComplProb;

import java.util.Scanner;

public class FlipCardsComplProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int op1 = x;
            int op2 = n - x;
            System.out.println(Math.min(op1, op2));
        }
    }
}
