package com.codechef.hundredDays.basicProgram.carChoice;

import java.util.Scanner;

public class CarChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y1 = sc.nextInt();
            double y2 = sc.nextInt();
            if (y1 / x1 > y2 / x2) {
                System.out.println(1);
            } else if (y1 / x1 < y2 / x2) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }
    }
}
