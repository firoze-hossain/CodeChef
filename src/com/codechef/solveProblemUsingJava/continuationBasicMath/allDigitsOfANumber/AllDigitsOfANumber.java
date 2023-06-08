package com.codechef.solveProblemUsingJava.continuationBasicMath.allDigitsOfANumber;

import java.util.Scanner;

public class AllDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            String b = " ";
            for (int i = 0; i < n.length(); i++) {
                System.out.print(n.charAt(i) + " ");

            }
            System.out.println();

        }
    }
}
