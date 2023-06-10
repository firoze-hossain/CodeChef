package com.codechef.solveProblemUsingJava.continuationBasicMath.constructN;

import java.util.Scanner;

public class ConstructN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n < 7 && n % 2 != 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
