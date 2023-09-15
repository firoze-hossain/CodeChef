package com.codechef.hundredDays.basicProgram.gradeTheSteel;

import java.util.Scanner;

public class GradeTheSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int hardness = sc.nextInt();
            double carbon = sc.nextDouble();
            int tensile = sc.nextInt();
            if (hardness > 50 && carbon < 0.7 && tensile > 5600) {
                System.out.println(10);
            } else if (hardness > 50 && carbon < 0.7) {
                System.out.println(9);
            } else if (carbon < 0.7 && tensile > 5600) {
                System.out.println(8);
            } else if (hardness > 50 && tensile > 5600) {
                System.out.println(7);
            } else if (hardness > 50 || carbon < 0.7 || tensile > 5600) {
                System.out.println(6);
            } else {
                System.out.println(5);
            }
        }
    }
}
