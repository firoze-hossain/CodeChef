package com.codechef.practice.minimumPizzas;

import java.util.Scanner;

public class MinimumPizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if ((n * x) % 4 == 0) {
                System.out.println((n * x) / 4);

            } else {
                System.out.println(((n * x) / 4) + 1);
            }
        }
    }
}
