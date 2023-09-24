package com.codechef.hundredDays.basicProgram.rCBAndPlayoffs;

import java.util.Scanner;

public class RCBAndPlayoffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x + z * 2 >= y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
