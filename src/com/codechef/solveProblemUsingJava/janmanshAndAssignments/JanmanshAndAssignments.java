package com.codechef.solveProblemUsingJava.janmanshAndAssignments;

import java.util.Scanner;

public class JanmanshAndAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x + 3 <= 10) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
