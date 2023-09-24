package com.codechef.hundredDays.basicProgram.chefAndWaterBottles;

import java.util.Scanner;

public class ChefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int fullBottle = Math.min(n, k / x);
            System.out.println(fullBottle);
        }
    }
}
