package com.codechef.advancedDSAPaths.basicProgramming.findRemainder;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a % b);
        }
    }
}
