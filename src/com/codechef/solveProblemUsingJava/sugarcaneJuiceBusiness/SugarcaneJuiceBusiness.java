package com.codechef.solveProblemUsingJava.sugarcaneJuiceBusiness;

import java.util.Scanner;

public class SugarcaneJuiceBusiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((n * 50) - (((20 * (n * 50)) / 100) + ((20 * (n * 50)) / 100) + ((30 * (n * 50)) / 100)));
        }
    }
}
