package com.codechef.twoStar.hoopJump;

import java.util.Scanner;

public class HoopJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n == 1) {
                    count++;
                } else {
                    count = n / 2 + 1;
                    break;
                }

            }
            System.out.println(count);
        }
    }
}
