package com.codechef.hundredDays.basicProgram.chefAndSnackDown;

import java.util.Scanner;

public class ChefAndSnackDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 2010 || n == 2015 || n == 2016 || n == 2017 || n == 2019) {
                System.out.println("HOSTED");
            } else {
                System.out.println("NOT HOSTED");
            }
        }
    }
}
