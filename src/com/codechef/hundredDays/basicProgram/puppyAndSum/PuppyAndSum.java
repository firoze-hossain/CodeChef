package com.codechef.hundredDays.basicProgram.puppyAndSum;

import java.util.Scanner;

public class PuppyAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(sum(d, n));
        }
    }

    public static int sum(int d, int n) {
        if (d == 1) {
            return sum(n);
        } else {
            return sum(d - 1, sum(n));
        }
    }

    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
