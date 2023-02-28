package com.codechef.solveProblemUsingJava.debugCredits;

import java.util.Scanner;

public class DebugCredits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int total_credits = 4 * x + 2 * y + 0 * z;
            System.out.println(total_credits);
        }
    }
}
