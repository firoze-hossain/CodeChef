package com.codechef.solveProblemUsingJava.buildLogicRevProb5;

import java.util.Scanner;

public class buildLogicRevProb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int x = p % 100;
            int y = p / 100;
            if (x + y <= 10) {
                System.out.println(x + y);
            } else {
                System.out.println(-1);
            }
        }
    }
}
