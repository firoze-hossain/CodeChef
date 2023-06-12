package com.codechef.solveProblemUsingJava.continuationBasicMath.eraOfCyberver;

import java.util.Scanner;

public class EraOfCyberver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            double s = Math.floor(k / n);
            int s1 = (int) s;
            System.out.println(s1);
        }
    }
}
