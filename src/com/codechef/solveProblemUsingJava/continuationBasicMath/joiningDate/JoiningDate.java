package com.codechef.solveProblemUsingJava.continuationBasicMath.joiningDate;

import java.util.Scanner;

public class JoiningDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextInt();
            double k = sc.nextInt();
            double x = Math.ceil(n / 5);
            double y = Math.ceil(k / 5);
            int a = (int) x;
            int b = (int) y;
            System.out.println(a - b);

        }
    }
}
