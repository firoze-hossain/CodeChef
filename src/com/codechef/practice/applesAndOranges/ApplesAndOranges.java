package com.codechef.practice.applesAndOranges;

import java.util.Scanner;

public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b <= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
