package com.codechef.practice.theMangoTruck;

import java.util.Scanner;

public class TheMangoTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println((z - y) / x);
        }
    }
}
