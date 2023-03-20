package com.codechef.solveProblemUsingJava.logicRevProb1;

import java.util.Scanner;

public class LogicRevProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x = (x - 1) / 10;
            y = (y - 1) / 10;
            System.out.println(Math.abs(x - y));

        }
    }
}
