package com.codechef.practice.makeAP;

import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int c = sc.nextInt();
            if ((a + c) % 2 == 0) {
                System.out.println((a + c) / 2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
