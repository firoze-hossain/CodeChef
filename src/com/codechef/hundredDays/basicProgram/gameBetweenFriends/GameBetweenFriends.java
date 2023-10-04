package com.codechef.hundredDays.basicProgram.gameBetweenFriends;

import java.util.Scanner;

public class GameBetweenFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a < b) {
                a += c;
            } else {
                b += c;
            }
            if (a < b) {
                a += d;
            } else {
                b += d;
            }

            if (a >= b) {
                System.out.println("N");
            } else {
                System.out.println("S");
            }
        }
    }

}
