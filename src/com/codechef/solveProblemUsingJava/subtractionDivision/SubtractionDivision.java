package com.codechef.solveProblemUsingJava.subtractionDivision;

import java.util.Scanner;

public class SubtractionDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = a - b;
            int q = a / b;
            System.out.println(d + " " + q);
        }
    }
}
