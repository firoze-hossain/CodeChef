package com.codechef.solveProblemUsingJava.bathProblemComplProb;

import java.util.Scanner;

public class BathProblemComplProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int filledBuckets = x % y;
            if (filledBuckets != 1) {
                filledBuckets = x / y;
                int people = filledBuckets / 2;
                System.out.println(people);
            }
        }
    }
}
