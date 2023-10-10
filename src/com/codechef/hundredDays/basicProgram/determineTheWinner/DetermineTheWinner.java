package com.codechef.hundredDays.basicProgram.determineTheWinner;

import java.util.Scanner;

public class DetermineTheWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int pa = sc.nextInt();
            int pb = sc.nextInt();
            int qa = sc.nextInt();
            int qb = sc.nextInt();
            int maxTimeP = Math.max(pa, pb);
            int maxTimeQ = Math.max(qa, qb);
            if (maxTimeP < maxTimeQ) {
                System.out.println("P");
            } else if (maxTimeP > maxTimeQ) {
                System.out.println("Q");
            } else {
                System.out.println("Tie");
            }
        }
    }

}
