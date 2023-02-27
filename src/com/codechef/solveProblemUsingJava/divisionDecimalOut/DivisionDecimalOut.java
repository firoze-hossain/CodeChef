package com.codechef.solveProblemUsingJava.divisionDecimalOut;

import java.util.Scanner;

public class DivisionDecimalOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double x = a / b;
            System.out.println(x);
        }
    }
}
