package com.codechef.java.continueStatement;

import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= 20; i++) {
            if (i == n) {
                continue;
            }
            System.out.println(i);
        }
    }
}
