package com.codechef.hundredDays.basicProgram.goldMining;

import java.util.Scanner;

public class GoldMining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((n + 1) * y >= x) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
