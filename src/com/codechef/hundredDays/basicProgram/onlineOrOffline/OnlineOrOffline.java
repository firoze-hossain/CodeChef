package com.codechef.hundredDays.basicProgram.onlineOrOffline;

import java.util.Scanner;

public class OnlineOrOffline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextInt();
            double m = sc.nextInt();
            double x = n - ((n * 10) / 100);
            if (x < m) {
                System.out.println("ONLINE");
            } else if (x > m) {
                System.out.println("DINING");
            } else {
                System.out.println("EITHER");
            }
        }
    }
}
