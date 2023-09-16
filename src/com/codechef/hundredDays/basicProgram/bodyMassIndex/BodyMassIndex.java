package com.codechef.hundredDays.basicProgram.bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int h = sc.nextInt();
            int bmi = (m / (h * h));
            if (bmi <= 18) {
                System.out.println(1);
            } else if (bmi >= 9 && bmi <= 24) {
                System.out.println(2);
            } else if (bmi >= 25 && bmi <= 29) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        }
    }
}
