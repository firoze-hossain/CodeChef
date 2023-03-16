package com.codechef.practice.lunchtime;

import java.util.Scanner;

public class Lunchtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x >= 1 && x <= 4) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
