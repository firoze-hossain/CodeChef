package com.codechef.hundredDays.basicProgram.fINDAAndB;

import java.util.Scanner;

public class FINDAAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((x * y) % z == 0) {
                System.out.println(x * y + " " + z);
            } else if ((y * z) % x == 0) {
                System.out.println((y * z) + " " + x);
            } else if ((x * z) % y == 0) {
                System.out.println((x * z) + " " + y);
            } else {
                System.out.println(-1);
            }
        }
    }
}
