package com.codechef.hundredDays.basicProgram.marioAndBullet;

import java.util.Scanner;

public class MarioAndBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (y / x < z) {
                System.out.println(z - (y / x));
            } else {
                System.out.println(0);
            }
        }
    }

}
