package com.codechef.solveProblemUsingJava.string.numericalStrings;

import java.util.Scanner;

public class NumericalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int n = a.length();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == b.charAt(n - i - 1)) {
                    flag = 0;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
