package com.codechef.solveProblemUsingJava.reviewProblem4;

import java.util.Scanner;

public class ReviewProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int perimeter = 2 * (n + m);
            int price = perimeter * x;
            System.out.println(price);
        }
    }
}
