package com.codechef.solveProblemUsingJava.string.reviewProblem1;

import java.util.Scanner;

public class ReviewProblem1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        while (t-- > 0) {
            String s = read.next();
            // Update the code below to solve this problem
            int amber = 0;
            int brass = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    amber = amber + 1;
                } else if (s.charAt(i) == 'b') {
                    brass = brass + 1;

                }
            }
            if (amber > brass) {
                System.out.println(brass);
            } else if (brass > amber) {
                System.out.println(amber);
            } else if (amber == brass) {
                System.out.println(amber);
            } else {
                System.out.println(0);
            }
        }
    }
}
