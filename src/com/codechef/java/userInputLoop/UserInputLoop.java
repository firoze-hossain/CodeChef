package com.codechef.java.userInputLoop;

import java.util.Scanner;

public class UserInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        while (a < n) {
            System.out.println(a);
            a++;
        }
    }
}
