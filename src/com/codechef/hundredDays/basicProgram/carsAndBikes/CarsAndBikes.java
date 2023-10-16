package com.codechef.hundredDays.basicProgram.carsAndBikes;

import java.util.Scanner;

public class CarsAndBikes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n >= 4 && n % 4 == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }

}
