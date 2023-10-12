package com.codechef.hundredDays.basicProgram.tradeSurplus;

import java.util.Scanner;

public class TradeSurplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int c = (a1 - a2) + (b1 - b2);

            if (c < 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
