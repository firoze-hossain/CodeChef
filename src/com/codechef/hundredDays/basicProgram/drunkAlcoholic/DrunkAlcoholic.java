package com.codechef.hundredDays.basicProgram.drunkAlcoholic;

import java.util.Scanner;

public class DrunkAlcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= k; i++) {
                if (i % 2 != 0) {
                    count += 3;
                } else {
                    count -= 1;
                }
            }
            System.out.println(count);
        }
    }
}
