package com.codechef.hundredDays.basicProgram.minimumNumberOfCoins;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if ((x % 10) % 5 == 0) {
                System.out.println((x / 10) + ((x % 10) / 5));

            } else {
                System.out.println(-1);
            }
        }
    }

}
