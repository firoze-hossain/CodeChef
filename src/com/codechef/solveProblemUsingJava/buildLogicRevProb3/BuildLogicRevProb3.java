package com.codechef.solveProblemUsingJava.buildLogicRevProb3;

import java.util.Scanner;

public class BuildLogicRevProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int z = (int) Math.pow(2, x);
            int k = (int) Math.pow(2, n);
            System.out.println(z / k);
        }
    }
}
