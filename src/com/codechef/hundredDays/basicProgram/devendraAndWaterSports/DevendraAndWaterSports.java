package com.codechef.hundredDays.basicProgram.devendraAndWaterSports;

import java.util.Scanner;

public class DevendraAndWaterSports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int cost = y + a + b + c;
            if (cost <= z) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
