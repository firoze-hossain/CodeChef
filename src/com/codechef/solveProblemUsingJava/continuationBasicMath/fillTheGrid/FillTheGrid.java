package com.codechef.solveProblemUsingJava.continuationBasicMath.fillTheGrid;

import java.util.Scanner;

public class FillTheGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n % 2 != 0 && m % 2 != 0) {
                System.out.println(n + m - 1);
            } else if (n % 2 == 0 && m % 2 != 0) {
                System.out.println(n);
            } else if (n % 2 != 0 && m % 2 == 0) {
                System.out.println(m);
            } else {
                System.out.println(0);
            }
        }
    }
}
