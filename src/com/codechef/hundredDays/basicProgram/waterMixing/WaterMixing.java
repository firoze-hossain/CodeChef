package com.codechef.hundredDays.basicProgram.waterMixing;

import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (a == b) {
                System.out.println("Yes");
            } else if (a < b && a + x >= b) {
                System.out.println("Yes");
            } else if (a > b && a - y <= b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
