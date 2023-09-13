package com.codechef.hundredDays.basicProgram.grossSalary;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double salary = sc.nextInt();

            if (salary < 1500) {
                double grossSalary = salary + ((salary * 10) / 100) + ((salary * 90) / 100);
                System.out.println(grossSalary);
            } else {
                double grossSalary = salary + 500 + ((salary * 98) / 100);
                System.out.println(grossSalary);
            }
        }
    }
}
