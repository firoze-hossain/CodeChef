package com.codechef.solveProblemUsingJava.debugParty;

import java.util.Scanner;

public class DebugParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            if (n * x <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
