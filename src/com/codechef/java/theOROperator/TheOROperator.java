package com.codechef.java.theOROperator;

import java.util.Scanner;

public class TheOROperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
