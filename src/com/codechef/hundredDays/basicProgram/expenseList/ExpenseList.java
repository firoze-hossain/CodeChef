package com.codechef.hundredDays.basicProgram.expenseList;

import java.util.Scanner;

public class ExpenseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextInt();
            double x = sc.nextInt();
            double totalIncome = Math.pow(2, x);
            for (int i = 1; i <= n; i++) {
                totalIncome -= totalIncome / 2;
            }
            System.out.println((int) totalIncome);
        }

    }

}
