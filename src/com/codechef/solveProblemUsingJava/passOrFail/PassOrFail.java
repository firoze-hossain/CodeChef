package com.codechef.solveProblemUsingJava.passOrFail;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            if (((x * 3) - (n - x)) >= p) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
