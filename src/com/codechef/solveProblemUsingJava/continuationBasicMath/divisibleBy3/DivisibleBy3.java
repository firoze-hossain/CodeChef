package com.codechef.solveProblemUsingJava.continuationBasicMath.divisibleBy3;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 3 == 0 || b % 3 == 0) {
                System.out.println(0);
            } else {
                if (Math.abs(a - b) % 3 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
