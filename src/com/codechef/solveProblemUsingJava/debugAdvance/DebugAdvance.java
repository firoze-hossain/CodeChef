package com.codechef.solveProblemUsingJava.debugAdvance;

import java.util.Scanner;

public class DebugAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= y && y <= (x + 200)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
