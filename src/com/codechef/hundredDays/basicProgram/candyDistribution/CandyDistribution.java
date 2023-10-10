package com.codechef.hundredDays.basicProgram.candyDistribution;

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n / m) % 2 == 0 && n % m == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
