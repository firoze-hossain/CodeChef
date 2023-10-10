package com.codechef.hundredDays.basicProgram.marioAndTransformation;

import java.util.Scanner;

public class MarioAndTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x % 3 == 0) {
                System.out.println("Normal");
            } else if (x % 3 == 1) {
                System.out.println("Huge");
            } else {
                System.out.println("Small");
            }
        }
    }

}
