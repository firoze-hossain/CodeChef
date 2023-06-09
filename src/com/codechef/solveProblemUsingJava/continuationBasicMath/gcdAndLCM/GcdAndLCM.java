package com.codechef.solveProblemUsingJava.continuationBasicMath.gcdAndLCM;

import java.util.Scanner;

public class GcdAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] divisorsAAndB = new int[Math.min(a, b)];
            int k = 0;
            for (int i = 1; i < Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    divisorsAAndB[k++] = i;
                }
            }
            int gcd = 0;
            for (int j = 0; j < k; j++) {
                if (divisorsAAndB[j] > gcd) {
                    gcd = divisorsAAndB[j];
                }
            }
            int lcm = (a * b) / gcd;
            System.out.println(gcd + " " + lcm);
        }
    }
}
