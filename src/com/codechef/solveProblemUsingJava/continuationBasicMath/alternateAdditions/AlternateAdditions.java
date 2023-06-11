package com.codechef.solveProblemUsingJava.continuationBasicMath.alternateAdditions;

import java.util.Scanner;

public class AlternateAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((b - a) % 3 == 2) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
