package com.codechef.practice.sleepDeprivation;

import java.util.Scanner;

public class SleepDeprivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x < 7) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
