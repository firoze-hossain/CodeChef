package com.codechef.solveProblemUsingJava.debugRent;

import java.util.Scanner;

public class DebugRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (x <= 300) {
                System.out.println(300 * 10);
            } else {
                System.out.println(x * 10);
            }
        }

    }
}
