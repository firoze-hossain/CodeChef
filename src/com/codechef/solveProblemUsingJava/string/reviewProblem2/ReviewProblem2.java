package com.codechef.solveProblemUsingJava.string.reviewProblem2;

import java.util.Scanner;

public class ReviewProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int flag = 0;
            for (int i = 0; i < s.length(); i = i + 2) {
                if ((s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') || (s.charAt(i) == 'B' && s.charAt(i + 1) == 'A')) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
