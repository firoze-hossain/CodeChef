package com.codechef.hundredDays.basicProgram.maximiseTheTastiness;

import java.util.Scanner;

public class MaximiseTheTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int maxTaste1 = Math.max(a, b);
            int maxTaste2 = Math.max(c, d);
            int result = maxTaste1 + maxTaste2;
            System.out.println(result);
        }
    }

}
