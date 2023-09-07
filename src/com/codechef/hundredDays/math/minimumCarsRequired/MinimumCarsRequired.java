package com.codechef.hundredDays.math.minimumCarsRequired;

import java.util.Scanner;

public class MinimumCarsRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextInt();
            System.out.println((int) Math.ceil(n / 4));
        }
    }
}
