package com.codechef.practice.miamiGP;

import java.util.Scanner;

public class MiamiGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float x = sc.nextInt();
            float y = sc.nextInt();
            if (((x / y) * 107) >= 100 && ((x / y) * 107) <= 107) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
