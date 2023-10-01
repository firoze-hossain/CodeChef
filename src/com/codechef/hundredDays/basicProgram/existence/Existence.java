package com.codechef.hundredDays.basicProgram.existence;

import java.util.Scanner;

public class Existence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            long x = sc.nextLong();
            long y = sc.nextLong();
            long right = (x * x * x * x) + (4 * (y * y));
            long left = (4 * (x * x) * y);
            if (right == left) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
