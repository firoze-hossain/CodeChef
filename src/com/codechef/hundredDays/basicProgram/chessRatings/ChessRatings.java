package com.codechef.hundredDays.basicProgram.chessRatings;

import java.util.Scanner;

public class ChessRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            if (x == y) {
                System.out.println(0);
            } else if (x < y) {
                System.out.println((int) Math.ceil((y - x) / 8));
            }
        }
    }

}
