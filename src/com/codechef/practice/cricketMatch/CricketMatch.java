package com.codechef.practice.cricketMatch;

import java.util.Scanner;

public class CricketMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m * 6 * 6 >= n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
