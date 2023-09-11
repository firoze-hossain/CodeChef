package com.codechef.hundredDays.basicProgram.secondLargest;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = Math.min(Math.min(Math.max(a, b), Math.max(a, c)), Math.max(b, c));
            System.out.println(result);
        }
    }
}
