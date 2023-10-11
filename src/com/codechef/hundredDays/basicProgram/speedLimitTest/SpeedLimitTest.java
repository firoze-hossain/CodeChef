package com.codechef.hundredDays.basicProgram.speedLimitTest;

import java.util.Scanner;

public class SpeedLimitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double a = sc.nextInt();
            double x = sc.nextInt();
            double b = sc.nextInt();
            double y = sc.nextInt();
            if (a / x > b / y) {
                System.out.println("Alice");
            } else if (a / x < b / y) {
                System.out.println("Bob");
            } else {
                System.out.println("Equal");
            }
        }
    }

}
