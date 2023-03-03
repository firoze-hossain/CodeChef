package com.codechef.solveProblemUsingJava.condReviewProb1;

import java.util.Scanner;

public class CondReviewProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x > y && x > z) {
                System.out.println("Setter");
            } else if (y > x && y > z) {
                System.out.println("Tester");
            } else {
                System.out.println("Editorialist");
            }
        }
    }
}
