package com.codechef.hundredDays.basicProgram.messiVsRonaldo;

import java.util.Scanner;

public class MessiVsRonaldo {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (a * 2 + b > x * 2 + y) {
            System.out.println("Messi");
        } else if (a * 2 + b < x * 2 + y) {
            System.out.println("Ronaldo");
        } else {
            System.out.println("Equal");
        }

    }
}
