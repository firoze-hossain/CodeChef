package com.codechef.practice.passesForFair;

import java.util.Scanner;

public class PassesForFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k > n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
