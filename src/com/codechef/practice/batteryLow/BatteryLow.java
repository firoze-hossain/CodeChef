package com.codechef.practice.batteryLow;

import java.util.Scanner;

public class BatteryLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x <= 15) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
