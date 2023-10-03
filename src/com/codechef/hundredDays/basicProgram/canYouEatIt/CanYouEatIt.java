package com.codechef.hundredDays.basicProgram.canYouEatIt;

import java.util.Scanner;

public class CanYouEatIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0) {
                System.out.println(0);
            } else if (n % k == 0) {
                System.out.println(n / k);
            } else {
                System.out.println(-1);
            }
        }
    }

}
