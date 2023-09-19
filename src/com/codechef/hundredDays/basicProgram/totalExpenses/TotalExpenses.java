package com.codechef.hundredDays.basicProgram.totalExpenses;

import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double quantity = sc.nextInt();
            double price = sc.nextInt();
            if (quantity > 1000) {
                double offered = (quantity * price) - ((price * quantity * 10) / 100);
                System.out.println(offered);
            } else {
                System.out.println(quantity * price);
            }
        }
    }
}
