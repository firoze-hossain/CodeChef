package com.codechef.practice.mATH1Enrolment;

import java.util.Scanner;

public class MATH1Enrolment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > x) {
                System.out.println(y - x);
            } else {
                System.out.println(0);
            }
        }
    }
}
