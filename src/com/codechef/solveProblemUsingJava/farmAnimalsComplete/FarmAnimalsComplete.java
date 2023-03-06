package com.codechef.solveProblemUsingJava.farmAnimalsComplete;

import java.util.Scanner;

public class FarmAnimalsComplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (z % x == 0 && z % y == 0) {
                System.out.println("ANY");
            } else if (z % x == 0) {
                System.out.println("CHICKEN");
            } else if (z % y == 0) {
                System.out.println("DUCK");
            } else {
                System.out.println("NONE");
            }
        }
    }
}
