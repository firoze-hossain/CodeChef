package com.codechef.solveProblemUsingJava.string.reviewProblem4;

import java.util.Scanner;

public class ReviewProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            int n = a.length();
            String b = "";
            int c = 0;
            for (int i = 0; i < n; i++) {
                c = Math.abs(a.charAt(i) - 122) + 97;
                b = b + (char) c;

            }
            System.out.println(b);
        }
    }
}
