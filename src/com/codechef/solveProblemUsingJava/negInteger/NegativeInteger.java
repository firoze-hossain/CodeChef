package com.codechef.solveProblemUsingJava.negInteger;

import java.util.Scanner;

public class NegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(-n);
        }
    }
}
