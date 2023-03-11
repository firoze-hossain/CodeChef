package com.codechef.solveProblemUsingJava.problemMarioComplProb;

import java.util.Scanner;

public class ProblemMarioComplProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x % 3 == 0) {
                System.out.println("NORMAL");
            } else if ((x - 1) % 3 == 0) {
                System.out.println("HUGE");
            } else {
                System.out.println("SMALL");
            }
        }
    }
}
