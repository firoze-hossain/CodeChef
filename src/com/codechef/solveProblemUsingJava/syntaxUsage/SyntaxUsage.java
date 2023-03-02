package com.codechef.solveProblemUsingJava.syntaxUsage;

import java.util.Scanner;

public class SyntaxUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n <= 100) {
                System.out.println("Good");
            } else if (n > 100 && n <= 200) {
                System.out.println("Better");
            } else {
                System.out.println("Best");
            }
        }
    }
}
