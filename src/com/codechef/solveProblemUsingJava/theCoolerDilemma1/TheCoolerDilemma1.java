package com.codechef.solveProblemUsingJava.theCoolerDilemma1;

import java.util.Scanner;

public class TheCoolerDilemma1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
            if (x * m < y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
