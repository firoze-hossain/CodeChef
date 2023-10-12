package com.codechef.hundredDays.basicProgram.sundayBrunch;

import java.util.Scanner;

public class SundayBrunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x / y == 1) {
                System.out.println(20);
            } else if (x / y <= 20) {
                System.out.println(x / y);
            } else {
                System.out.println(20);
            }
        }
    }

}
