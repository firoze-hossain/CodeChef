package com.codechef.solveProblemUsingJava.doubleStrings;

import java.util.Scanner;

public class DoubleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String x = s + s;
            System.out.println(x);
        }
    }
}
