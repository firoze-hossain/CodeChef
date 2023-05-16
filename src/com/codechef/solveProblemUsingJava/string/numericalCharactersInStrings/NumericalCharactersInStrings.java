package com.codechef.solveProblemUsingJava.string.numericalCharactersInStrings;

import java.util.Scanner;

public class NumericalCharactersInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            int flag = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '5' || a.charAt(i) == '0') {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
