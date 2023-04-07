package com.codechef.solveProblemUsingJava.oddSumPair;

import java.util.Scanner;

public class OddSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a + b) % 2 != 0 || (a + c) % 2 != 0 || (b + c) % 2 != 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
