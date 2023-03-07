package com.codechef.solveProblemUsingJava.highAccuracyCompProb;

import java.util.Scanner;

public class HighAccuracyCompProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x % 3 == 0) {
                System.out.println(0);
            } else if ((x + 1) % 3 == 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
