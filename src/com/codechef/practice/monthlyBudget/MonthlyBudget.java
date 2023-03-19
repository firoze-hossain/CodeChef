package com.codechef.practice.monthlyBudget;

import java.util.Scanner;

public class MonthlyBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x >= y * 30) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
