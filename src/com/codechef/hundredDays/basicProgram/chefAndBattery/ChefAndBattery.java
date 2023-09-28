package com.codechef.hundredDays.basicProgram.chefAndBattery;

import java.util.Scanner;

public class ChefAndBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int i;
            for (i = 0; n != 50; i++) {
                if (n < 50) {
                    n += 2;
                } else {
                    n -= 3;
                }
            }
            System.out.println(i);
        }

    }
}
