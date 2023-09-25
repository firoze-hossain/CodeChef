package com.codechef.hundredDays.basicProgram.hardestProblemBet;

import java.util.Scanner;

public class HardestProblemBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b < c && b < a) {
                System.out.println("Bob");
            } else if (c < b && c < a) {
                System.out.println("Alice");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
