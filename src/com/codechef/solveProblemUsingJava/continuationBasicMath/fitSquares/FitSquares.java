package com.codechef.solveProblemUsingJava.continuationBasicMath.fitSquares;

import java.util.Scanner;

public class FitSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int b = sc.nextInt();
            double s = Math.floor(b / 2);
            int s1 = (int) s;
            System.out.println(((s1 - 1) * s1) / 2);
           // System.out.println(((b / 2 * b / 2) - b / 2) / 2);
        }
    }
}
