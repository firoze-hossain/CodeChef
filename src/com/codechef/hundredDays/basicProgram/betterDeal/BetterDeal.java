package com.codechef.hundredDays.basicProgram.betterDeal;

import java.util.Scanner;

public class BetterDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (100 - ((100 * a) / 100) < (200 - ((200 * b) / 100))) {
                System.out.println("First");
            } else if (100 - ((100 * a) / 100) > (200 - ((200 * b) / 100))) {
                System.out.println("Second");
            } else {
                System.out.println("Both");
            }
        }
    }
}
