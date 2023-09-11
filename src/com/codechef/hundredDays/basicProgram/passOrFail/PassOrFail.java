package com.codechef.hundredDays.basicProgram.passOrFail;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            if (((x * 3) - (n - x)) >= p) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
