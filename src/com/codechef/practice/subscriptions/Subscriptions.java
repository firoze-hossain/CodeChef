package com.codechef.practice.subscriptions;

import java.util.Scanner;

public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n <= 6) {
                System.out.println(x);
            } else if (n % 6 == 0 && n > 6) {
                System.out.println(n / 6 * x);
            } else {

                System.out.println((n / 6 + 1) * x);
            }
        }
    }
}
