package com.codechef.hundredDays.basicProgram.completeTheCredits;

import java.util.Scanner;

public class CompleteTheCredits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x > 65) {
                System.out.println("Overload");
            } else if (x < 35) {
                System.out.println("Underload");
            } else {
                System.out.println("Normal");
            }
        }
    }
}
