package com.codechef.hundredDays.basicProgram.discusThrow;

import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a >= b && a >= c) {
                System.out.println(a);
            } else if (b >= a && b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}

