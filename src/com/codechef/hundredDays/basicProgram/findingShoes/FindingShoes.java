package com.codechef.hundredDays.basicProgram.findingShoes;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m >= n) {
                System.out.println(n);
            } else if (m == 0) {
                System.out.println(n * 2);
            } else {
                System.out.println((n - m) + n);
            }
        }
    }
}
