package com.codechef.hundredDays.basicProgram.findingSquareRoots;

import java.util.Scanner;

public class FindingSquareRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((int) Math.sqrt(n));
        }
    }
}
