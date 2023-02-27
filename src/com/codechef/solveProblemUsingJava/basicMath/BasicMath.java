package com.codechef.solveProblemUsingJava.basicMath;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int S = A + B;
            int P = A * B;
            System.out.println(S + " " + P);
        }
    }
}
