package com.codechef.hundredDays.basicProgram.canReach;

import java.util.Scanner;

public class CanReach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            if (x % k == 0 && y % k == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
