package com.codechef.hundredDays.basicProgram.tooManyItems;

import java.util.Scanner;

public class TooManyItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            double result = Math.ceil((double) n / 10);
            System.out.println((int) result);
        }
    }

}
