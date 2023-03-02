package com.codechef.solveProblemUsingJava.interiorDesign;

import java.util.Scanner;

public class InteriorDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int amount = Math.min(x1 + y1, x2 + y2);
            System.out.println(amount);
        }
    }
}
