package com.codechef.solveProblemUsingJava.applesOranges;

import java.util.Scanner;

public class ApplesOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (x >= a + b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
