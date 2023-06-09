package com.codechef.solveProblemUsingJava.continuationBasicMath.keplersLaw;

import java.util.Scanner;

public class KeplersLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            double const1 = Math.pow(t1, 2) * Math.pow(r2, 3);
            double const2 = Math.pow(t2, 2) * Math.pow(r1, 3);
            if (const1 == const2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
