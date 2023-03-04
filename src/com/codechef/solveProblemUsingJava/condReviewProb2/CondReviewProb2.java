package com.codechef.solveProblemUsingJava.condReviewProb2;

import java.util.Scanner;

public class CondReviewProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int disposableMask = x * (100 / 1);
            int clothMask = y * (100 / 10);
            if (disposableMask >= clothMask) {
                System.out.println("Cloth");
            } else {
                System.out.println("Disposable");
            }
        }
    }
}
