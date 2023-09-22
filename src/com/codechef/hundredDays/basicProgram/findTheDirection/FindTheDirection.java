package com.codechef.hundredDays.basicProgram.findTheDirection;

import java.util.Scanner;

public class FindTheDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x % 4 == 0) {
                System.out.println("North");
            } else if (x % 4 == 1) {
                System.out.println("East");
            } else if (x % 4 == 2) {
                System.out.println("South");
            } else {
                System.out.println("West");
            }

        }
    }
}
