package com.codechef.practice.airConditionerTemperature;

import java.util.Scanner;

public class AirConditionerTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a <= b && c <= b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
