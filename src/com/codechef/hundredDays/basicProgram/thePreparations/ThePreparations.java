package com.codechef.hundredDays.basicProgram.thePreparations;

import java.util.Scanner;

public class ThePreparations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n * k < m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
