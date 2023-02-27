package com.codechef.solveProblemUsingJava.totalPrizeMoney;

import java.util.Scanner;

public class TotalPrizeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int prize_top10 = 10 * x;
            int prize_11to100 = 90 * y;
            System.out.println(prize_top10 + prize_11to100);
        }
    }
}
