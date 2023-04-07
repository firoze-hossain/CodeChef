package com.codechef.practice.bestCoupon;

import java.util.Scanner;

public class BestCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int dis1 = x / 10;
            System.out.println(Math.max(dis1, 100));
        }
    }
}
