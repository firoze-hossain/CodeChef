package com.codechef.advancedDSAPaths.basicProgramming.sumOfDigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum = sum + temp;
                n = n / 10;
            }
            System.out.println(sum);
        }
    }
}
