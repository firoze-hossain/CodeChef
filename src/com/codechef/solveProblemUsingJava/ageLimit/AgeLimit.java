package com.codechef.solveProblemUsingJava.ageLimit;

import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if (a >= x && a < y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
